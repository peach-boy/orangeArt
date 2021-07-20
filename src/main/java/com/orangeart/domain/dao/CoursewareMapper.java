package com.orangeart.domain.dao;

import com.orangeart.domain.model.ClassDO;
import com.orangeart.domain.model.CoursewareDO;
import com.orangeart.protocal.request.FindStudentRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @Description: 课件
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 22:22
 * @Email:1414924381@qq.com
 */
@Mapper
public interface CoursewareMapper {
    int insert(CoursewareDO coursewareDO);

    List<CoursewareDO> find(FindStudentRequest request);

    int findCount(FindStudentRequest request);

    List<CoursewareDO> getAll();

    CoursewareDO getById(@Param("id") Integer id);

}
