package com.orangeart.service;

import com.google.common.collect.Lists;
import com.orangeart.constant.StudentStatusEnum;
import com.orangeart.domain.dao.StudentRepository;
import com.orangeart.domain.model.StudentDO;
import com.orangeart.protocal.Pagination;
import com.orangeart.protocal.model.StudentVO;
import com.orangeart.protocal.request.CreateStudentRequest;
import com.orangeart.protocal.request.FindStudentRequest;
import com.orangeart.util.OrangeArtDateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description: 学员相关
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 22:21
 * @Email:1414924381@qq.com
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Pagination<StudentVO> find(FindStudentRequest request) {
        Page<StudentDO> studentDOPage = studentRepository.findAll(PageRequest.of(request.getPageNo(), request.getPageSize()));

        long count = studentDOPage.getTotalElements();
        if (count == 0) {
            return new Pagination<>(0, Lists.newArrayList(), request);
        }

        List studentVOList = studentDOPage.getContent().stream().map(studentDO -> {
            StudentVO student = new StudentVO();
            student.setId(studentDO.getId());
            student.setName(studentDO.getName());
            student.setUnusedQuantity(10);
            student.setUsedQuantity(20);
            student.setRemark(studentDO.getRemark());
            student.setStatus(studentDO.getStatus());

            return student;
        }).collect(Collectors.toList());


        return new Pagination<>(count, studentVOList, request);
    }

    public Boolean create(CreateStudentRequest request) {
        StudentDO studentDO = new StudentDO();
        studentDO.setName(request.getName());
        studentDO.setAddress(request.getAddress());
        studentDO.setBirthYear(OrangeArtDateUtils.parseStrToDate(request.getBirthYear(), OrangeArtDateUtils.DAY_PATTARN));
        studentDO.setMobile(request.getMobile());
        studentDO.setGender(request.getGender());
        studentDO.setChannel(request.getChannel());
        studentDO.setStatus(StudentStatusEnum.NEED_PAY.getStatus());
        studentDO.setRemark(request.getRemark());
        studentRepository.save(studentDO);

        return Boolean.TRUE;
    }

}
