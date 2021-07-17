package com.orangeart.service;

import com.orangeart.constant.StatusEnum;
import com.orangeart.domain.dao.ClassMapper;
import com.orangeart.domain.model.ClassDO;
import com.orangeart.protocal.Pagination;
import com.orangeart.protocal.model.StudentVO;
import com.orangeart.protocal.request.CreateClassRequest;
import com.orangeart.protocal.request.FindClassRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description: 班级相关
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 22:21
 * @Email:1414924381@qq.com
 */
@Service
public class ClassService {

    @Resource
    private ClassMapper classMapper;

    public Pagination<StudentVO> find(FindClassRequest request) {

        return null;
    }

    public Boolean create(CreateClassRequest request) {
        ClassDO classDO = new ClassDO();

        classDO.setWeekDay(request.getWeekDay());
        classDO.setSubjectId(request.getSubjectId());
        classDO.setRemark(request.getRemark());
        classDO.setStatus(StatusEnum.YES.getStatus());
        classMapper.insert(classDO);

        return Boolean.TRUE;
    }

}
