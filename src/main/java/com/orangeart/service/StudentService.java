package com.orangeart.service;

import com.google.common.collect.Lists;
import com.orangeart.domain.entity.StudentDO;
import com.orangeart.domain.mapper.StudentMapper;
import com.orangeart.protocal.PageRequest;
import com.orangeart.protocal.Pagination;
import com.orangeart.protocal.model.StudentVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    public Pagination<StudentVO> list(PageRequest request) {
        //List<StudentDO> studentDOList = studentMapper.list();

        StudentVO student = new StudentVO();
        student.setId(1);
        student.setName("库里");
        student.setStatus(1);
        student.setUnusedQuantity(10);
        student.setUsedQuantity(20);
        student.setDescription("第一个学生");

        List studentDOList= Lists.newArrayList(student);
        return new Pagination<>(10, studentDOList, request);
    }

}
