package com.orangeart.domain.dao;

import com.orangeart.domain.model.ClassDO;
import com.orangeart.domain.model.StudentDO;
import com.orangeart.protocal.request.FindClassRequest;
import com.orangeart.protocal.request.FindLessonRequest;
import com.orangeart.protocal.request.FindStudentRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @Description: TODO
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 22:22
 * @Email:1414924381@qq.com
 */
@Mapper
public interface ClassMapper {
    int insert(ClassDO classDO);

    List<ClassDO> find(FindClassRequest request);

    int findCount(FindClassRequest request);

    List<ClassDO> getAll();

    ClassDO getById(@Param("id") Integer id);

}
