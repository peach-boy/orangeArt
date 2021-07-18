package com.orangeart.service;

import com.google.common.collect.Lists;
import com.orangeart.constant.ClassTypeEnum;
import com.orangeart.constant.StatusEnum;
import com.orangeart.constant.WeekDayEnum;
import com.orangeart.domain.dao.ClassMapper;
import com.orangeart.domain.model.ClassDO;
import com.orangeart.protocal.Pagination;
import com.orangeart.protocal.model.ClassCascaderItem;
import com.orangeart.protocal.model.ClassVO;
import com.orangeart.protocal.request.CreateClassRequest;
import com.orangeart.protocal.request.FindClassRequest;
import com.orangeart.util.OrangeArtDateUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.sql.Time;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description: 班级相关
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 22:21
 * @Email:1414924381@qq.com
 */
@Service
public class ClassService {

    @Resource
    private ClassMapper classMapper;

    public Pagination<ClassVO> find(FindClassRequest request) {
        int count = classMapper.findCount(request);
        if (count == 0) {
            return new Pagination<>(0, Lists.newArrayList(), request);
        }

        List<ClassDO> classDOList = classMapper.find(request);
        List<ClassVO> classVOList = classDOList.stream().map(classDO -> {
            ClassVO classVO = new ClassVO();
            classVO.setClassId(classDO.getId());

            classVO.setWeekDay(WeekDayEnum.getByCode(classDO.getWeekDay()).getDesc());
            classVO.setClassTime(classDO.getBeginTime() + "-" + classDO.getEndTime());
            classVO.setSubjectName("素描");
            classVO.setTypeName(ClassTypeEnum.getByType(classDO.getType()).getDesc());
            return classVO;
        }).collect(Collectors.toList());

        return new Pagination<>(count, classVOList, request);
    }

    public Boolean create(CreateClassRequest request) {
        ClassDO classDO = new ClassDO();

        Date beginTime = OrangeArtDateUtils.parseStrToDate(request.getBeginTime(), OrangeArtDateUtils.TIME_PATTARN);
        Date endTime = OrangeArtDateUtils.parseStrToDate(request.getEndTime(), OrangeArtDateUtils.TIME_PATTARN);

        classDO.setBeginTime(new Time(beginTime.getTime()));
        classDO.setEndTime(new Time(endTime.getTime()));
        classDO.setWeekDay(request.getWeekDay());
        classDO.setSubjectId(request.getSubjectId());
        classDO.setRemark(request.getRemark());
        classDO.setStatus(StatusEnum.YES.getStatus());
        classDO.setType(request.getType());
        classMapper.insert(classDO);

        return Boolean.TRUE;
    }

    public ClassVO getById(Integer classId) {
        ClassDO classDO = classMapper.getById(classId);

        ClassVO classVO = new ClassVO();
        classVO.setClassId(classDO.getId());
        classVO.setWeekDay(WeekDayEnum.getByCode(classDO.getWeekDay()).getDesc());
        classVO.setClassTime(classDO.getBeginTime() + "-" + classDO.getEndTime());
        classVO.setSubjectName("素描");
        classVO.setTypeName(ClassTypeEnum.getByType(classDO.getType()).getDesc());
        return classVO;
    }

    public List<ClassCascaderItem> getAll() {
        List<ClassDO> classDOList = classMapper.getAll();

        List<ClassCascaderItem> classCascaderItemList = new ArrayList<>(3);

        classCascaderItemList.add(this.buildItem(ClassTypeEnum.WORK_DAY_CLASS, classDOList));
        classCascaderItemList.add(this.buildItem(ClassTypeEnum.SUMMER_CLASS, classDOList));
        classCascaderItemList.add(this.buildItem(ClassTypeEnum.WINTER_CLASS, classDOList));

        classCascaderItemList = classCascaderItemList.stream()
                .filter(classCascaderItem -> !CollectionUtils.isEmpty(classCascaderItem.getItems())).collect(Collectors.toList());

        return classCascaderItemList;
    }


    private ClassCascaderItem buildItem(ClassTypeEnum classTypeEnum, List<ClassDO> classDOList) {
        ClassCascaderItem classCascaderItem = new ClassCascaderItem();
        classCascaderItem.setName(classTypeEnum.getDesc());
        classCascaderItem.setCode(classTypeEnum.getDesc());

        List<ClassCascaderItem> classCascaderItemList = new ArrayList<ClassCascaderItem>(7);

        for (int i = 0; i < 7; i++) {

            ClassCascaderItem weekDayItem = new ClassCascaderItem();
            WeekDayEnum weekDayEnum = WeekDayEnum.getByCode(i + 1);
            weekDayItem.setCode(weekDayEnum.getDesc());
            weekDayItem.setName(weekDayEnum.getDesc());
            for (ClassDO classDO : classDOList) {
                if (Objects.equals(classDO.getWeekDay(), i + 1)
                        && Objects.equals(classDO.getType(), classTypeEnum.getType())) {
                    ClassCascaderItem item = new ClassCascaderItem();
                    String className = classDO.getBeginTime() + "-" + classDO.getEndTime() + "-" + classDO.getSubjectId();
                    item.setCode(classDO.getId() + "");
                    item.setName(className);
                    item.setItems(null);
                    weekDayItem.getItems().add(item);
                }
            }


            if (CollectionUtils.isEmpty(weekDayItem.getItems())) {
                continue;
            }

            classCascaderItemList.add(weekDayItem);
        }

        classCascaderItem.setItems(classCascaderItemList);
        return classCascaderItem;
    }


}
