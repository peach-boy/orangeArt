package com.orangeart.service;

import com.google.common.collect.Lists;
import com.orangeart.constant.StatusEnum;
import com.orangeart.domain.dao.LessonMapper;
import com.orangeart.domain.dao.StudentMapper;
import com.orangeart.domain.model.CourseOrderDO;
import com.orangeart.domain.model.LessonDO;
import com.orangeart.domain.model.StudentDO;
import com.orangeart.protocal.Pagination;
import com.orangeart.protocal.model.CourseOrderVO;
import com.orangeart.protocal.model.LessonVO;
import com.orangeart.protocal.model.StudentVO;
import com.orangeart.protocal.request.CreateLessonRequest;
import com.orangeart.protocal.request.CreateStudentRequest;
import com.orangeart.protocal.request.FindLessonRequest;
import com.orangeart.util.OrangeArtDateUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description: 课时相关
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 22:21
 * @Email:1414924381@qq.com
 */
@Service
public class LessonService {

    @Resource
    private LessonMapper lessonMapper;

    @Resource
    private StudentMapper studentMapper;

    public Pagination<LessonVO> find(FindLessonRequest request) {

        if (StringUtils.isNoneBlank(request.getStudentName())) {
            StudentDO studentDO = studentMapper.getByName(request.getStudentName());
            if (studentDO != null) {
                request.setStudentId(studentDO.getId());
            }
        }


        int count = lessonMapper.findCount(request);
        if (count == 0) {
            return new Pagination<>(0, Lists.newArrayList(), request);
        }

        List<LessonDO> lessonDOList = lessonMapper.find(request);
        List<LessonVO> lessonVOList = lessonDOList.stream().map(lessonDO -> {
            LessonVO lessonVO = new LessonVO();

            StudentDO studentDO = studentMapper.getById(lessonDO.getStudentId());
            lessonVO.setId(lessonDO.getId());
            lessonVO.setStudentName(studentDO.getName());
            lessonVO.setClassTime(lessonDO.getClassTime());
            lessonVO.setType(lessonDO.getType());
            return lessonVO;
        }).collect(Collectors.toList());


        return new Pagination<>(count, lessonVOList, request);
    }

    public Boolean create(CreateLessonRequest request) {
        String studentName = request.getStudentName();
        StudentDO studentDO = studentMapper.getByName(studentName);

        LessonDO lessonDO = new LessonDO();
        lessonDO.setStudentId(studentDO.getId());

        Date classTime = OrangeArtDateUtils.parseStrToDate(request.getClassTime(), OrangeArtDateUtils.DAY_TIME_PATTARN);
        lessonDO.setClassTime(classTime);
        lessonDO.setType(request.getType());
        lessonDO.setStatus(StatusEnum.YES.getStatus());
        lessonDO.setSubjectId(request.getSubjectId());
        lessonDO.setCoursewareId(request.getCoursewareId());
        lessonDO.setClassId(request.getClassId());
        lessonMapper.insert(lessonDO);
        return Boolean.TRUE;
    }

}
