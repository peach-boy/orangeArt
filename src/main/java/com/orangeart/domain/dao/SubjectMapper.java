package com.orangeart.domain.dao;

import com.orangeart.domain.model.ClassDO;
import com.orangeart.domain.model.SubjectDO;
import com.orangeart.protocal.request.FindClassRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @Description: 科目
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 22:22
 * @Email:1414924381@qq.com
 */
@Mapper
public interface SubjectMapper {
    int insert(@Param("name") String name);

    List<SubjectDO> getAll();

    SubjectDO getById(@Param("id") Integer id);

}
