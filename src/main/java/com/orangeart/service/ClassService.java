package com.orangeart.service;

import com.orangeart.protocal.Pagination;
import com.orangeart.protocal.model.StudentVO;
import com.orangeart.protocal.request.CreateClassRequest;
import com.orangeart.protocal.request.FindClassRequest;
import org.springframework.stereotype.Service;


/**
 * @Description: 班级相关
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 22:21
 * @Email:1414924381@qq.com
 */
@Service
public class ClassService {

    public Pagination<StudentVO> find(FindClassRequest request) {

        return null;
    }

    public Boolean create(CreateClassRequest request) {

        return Boolean.TRUE;
    }

}
