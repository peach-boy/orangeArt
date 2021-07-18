package com.orangeart.domain.dao;

import com.orangeart.domain.model.LessonDO;
import com.orangeart.protocal.request.FindLessonRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @Description: 课时
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 22:22
 * @Email:1414924381@qq.com
 */
@Mapper
public interface LessonMapper {
    int insert(LessonDO lessonDO);

    List<LessonDO> find(FindLessonRequest request);

    int findCount(FindLessonRequest request);
}
