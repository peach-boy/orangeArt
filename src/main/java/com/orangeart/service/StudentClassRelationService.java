package com.orangeart.service;

import com.google.common.collect.Lists;
import com.orangeart.constant.StudentStatusEnum;
import com.orangeart.domain.dao.StudentClassRelationMapper;
import com.orangeart.domain.dao.StudentMapper;
import com.orangeart.domain.model.StudentClassRelationDO;
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
 * @Description: 学员班级关联关系
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 22:21
 * @Email:1414924381@qq.com
 */
@Service
public class StudentClassRelationService {

    @Resource
    private StudentClassRelationMapper studentClassRelationMapper;

    public Pagination<StudentVO> find(FindStudentRequest request) {
        return null;
    }

    public Boolean create(CreateStudentRequest request) {
        StudentClassRelationDO studentClassRelationDO = new StudentClassRelationDO();

        studentClassRelationMapper.insert(studentClassRelationDO);
        return Boolean.TRUE;
    }

}
