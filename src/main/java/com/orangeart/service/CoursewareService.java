package com.orangeart.service;

import com.google.common.collect.Lists;
import com.orangeart.constant.StudentStatusEnum;
import com.orangeart.domain.dao.CourseOrderMapper;
import com.orangeart.domain.dao.CoursewareMapper;
import com.orangeart.domain.dao.StudentMapper;
import com.orangeart.domain.model.CourseOrderDO;
import com.orangeart.domain.model.CoursewareDO;
import com.orangeart.domain.model.StudentDO;
import com.orangeart.protocal.Pagination;
import com.orangeart.protocal.model.CoursewareVO;
import com.orangeart.protocal.model.StudentVO;
import com.orangeart.protocal.request.CreateCoursewareRequest;
import com.orangeart.protocal.request.CreateStudentRequest;
import com.orangeart.protocal.request.FindStudentRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.swing.plaf.IconUIResource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description: 课件相关
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 22:21
 * @Email:1414924381@qq.com
 */
@Service
public class CoursewareService {

    @Resource
    private CoursewareMapper coursewareMapper;

    public Pagination<StudentVO> find(FindStudentRequest request) {


        return null;
    }

    public Boolean create(CreateCoursewareRequest request) {
        CoursewareDO coursewareDO = new CoursewareDO();
        coursewareDO.setCoursewareName(request.getCoursewareName());
        coursewareDO.setRemark(request.getRemark());
        coursewareMapper.insert(coursewareDO);

        return Boolean.TRUE;
    }

    public List<CoursewareVO> getAll() {
        List<CoursewareDO> coursewareDOList = coursewareMapper.getAll();

        List<CoursewareVO> coursewareVOList = coursewareDOList.stream().map(coursewareDO -> {
            CoursewareVO coursewareVO = new CoursewareVO();
            coursewareVO.setId(coursewareDO.getId());
            coursewareVO.setCoursewareName(coursewareDO.getCoursewareName());
            coursewareVO.setRemark(coursewareVO.getRemark());
            return coursewareVO;
        }).collect(Collectors.toList());

        return coursewareVOList;
    }

}
