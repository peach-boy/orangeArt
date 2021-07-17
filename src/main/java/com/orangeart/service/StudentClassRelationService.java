package com.orangeart.service;

import com.orangeart.protocal.Pagination;
import com.orangeart.protocal.model.StudentVO;
import com.orangeart.protocal.request.CreateStudentRequest;
import com.orangeart.protocal.request.FindStudentRequest;
import org.springframework.stereotype.Service;


/**
 * @Description: 学员班级关联关系
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 22:21
 * @Email:1414924381@qq.com
 */
@Service
public class StudentClassRelationService {



    public Pagination<StudentVO> find(FindStudentRequest request) {
        return null;
    }

    public Boolean create(CreateStudentRequest request) {


        return Boolean.TRUE;
    }

}
