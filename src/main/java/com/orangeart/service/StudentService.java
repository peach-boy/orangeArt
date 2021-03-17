package com.orangeart.service;

import com.google.common.collect.Lists;
import com.orangeart.domain.dao.StudentMapper;
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
 * @Description: TODO
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 22:21
 * @Email:xiantao.wu@guanaitong.com
 */
@Service
public class StudentService {

    @Resource
    private StudentMapper studentMapper;

    public Pagination<StudentVO> find(FindStudentRequest request) {
        int count = studentMapper.findCount(request);
        if (count == 0) {
            return new Pagination<>(0, Lists.newArrayList(), request);
        }

        List<StudentDO> studentDOList = studentMapper.find(request);
        List studentVOList = studentDOList.stream().map(studentDO -> {
            StudentVO student = new StudentVO();
            student.setId(studentDO.getId());
            student.setName(studentDO.getName());
            student.setUnusedQuantity(10);
            student.setUsedQuantity(20);
            student.setDescription("我是一个学生");
            return student;
        }).collect(Collectors.toList());

        return new Pagination<>(count, studentVOList, request);
    }

    public Boolean create(CreateStudentRequest request) {
        StudentDO studentDO = new StudentDO();
        studentDO.setName(request.getName());
        studentDO.setAddress(request.getAddress());
        studentDO.setBirthYear(request.getBirthYear());
        studentDO.setMobile(request.getMobile());
        studentDO.setGender(request.getGender());
        studentDO.setChannel(request.getChannel());
        studentMapper.insert(studentDO);

        return Boolean.TRUE;
    }

}
