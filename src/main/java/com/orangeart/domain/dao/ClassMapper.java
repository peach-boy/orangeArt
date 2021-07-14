package com.orangeart.domain.dao;

import com.orangeart.domain.model.StudentDO;
import com.orangeart.protocal.request.FindStudentRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @Description: TODO
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 22:22
 * @Email:1414924381@qq.com
 */
@Mapper
public interface ClassMapper {
    int insert(StudentDO studentDO);

    List<StudentDO> find(FindStudentRequest request);

    int findCount(FindStudentRequest request);

}
