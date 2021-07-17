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
import com.orangeart.protocal.model.StudentVO;
import com.orangeart.protocal.request.CreateStudentRequest;
import com.orangeart.protocal.request.FindStudentRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

    public Boolean create(CreateStudentRequest request) {
        CoursewareDO coursewareDO = new CoursewareDO();

        coursewareMapper.insert(coursewareDO);

        return Boolean.TRUE;
    }

}
