package com.orangeart.service;

import com.orangeart.domain.model.StudentDO;
import com.orangeart.protocal.Pagination;
import com.orangeart.protocal.model.StudentVO;
import com.orangeart.protocal.request.CreateStudentRequest;
import com.orangeart.protocal.request.FindStudentRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description: 课时相关
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 22:21
 * @Email:1414924381@qq.com
 */
@Service
public class LessonService {

    public Pagination<StudentVO> find(FindStudentRequest request) {

        return null;
    }

    public Boolean create(CreateStudentRequest request) {

        return Boolean.TRUE;
    }

}
