package com.orangeart.service;

import com.google.common.collect.Lists;
import com.orangeart.constant.StatusEnum;
import com.orangeart.domain.dao.CoursewareMapper;
import com.orangeart.domain.dao.LessonMapper;
import com.orangeart.domain.dao.StudentMapper;
import com.orangeart.domain.model.*;
import com.orangeart.protocal.Pagination;
import com.orangeart.protocal.model.ClassVO;
import com.orangeart.protocal.model.LessonVO;
import com.orangeart.protocal.request.CreateLessonRequest;
import com.orangeart.protocal.request.FindLessonRequest;
import com.orangeart.util.DatePattarn;
import com.orangeart.util.DateUtils;
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

    @Resource
    private CoursewareMapper coursewareMapper;

    @Resource
    private ClassService classService;

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
            CoursewareDO coursewareDO = coursewareMapper.getById(lessonDO.getCoursewareId());
            ClassVO classVO = classService.getById(lessonDO.getClassId());

            lessonVO.setId(lessonDO.getId());
            lessonVO.setStudentName(studentDO.getName());
            lessonVO.setClassTime(lessonDO.getClassTime());
            lessonVO.setType(lessonDO.getType());
            lessonVO.setCoursewareName(coursewareDO.getCoursewareName());
            lessonVO.setClassName(classVO.getWeekDay()+"-"+classVO.getSubjectName()+"("+classVO.getClassTime()+")");
            return lessonVO;
        }).collect(Collectors.toList());


        return new Pagination<>(count, lessonVOList, request);
    }

    public Boolean create(CreateLessonRequest request) {
        String studentName = request.getStudentName();
        StudentDO studentDO = studentMapper.getByName(studentName);

        LessonDO lessonDO = new LessonDO();
        lessonDO.setStudentId(studentDO.getId());

        Date classTime = DateUtils.parseToDate(request.getClassTime(), DatePattarn.DAY_TIME_PATTARN);
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
