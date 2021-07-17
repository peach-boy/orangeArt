package com.orangeart.domain.dao;

import com.orangeart.domain.model.CourseOrderDO;
import com.orangeart.domain.model.StudentDO;
import com.orangeart.protocal.request.FindCourseOrderRequest;
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
public interface CourseOrderMapper {
    int insert(CourseOrderDO courseOrderDO);

    List<CourseOrderDO> find(FindCourseOrderRequest request);

    int findCount(FindCourseOrderRequest request);

}
