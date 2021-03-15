package com.orangeart.domain.mapper;

import com.orangeart.domain.entity.StudentDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description: TODO
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 22:22
 * @Email:xiantao.wu@guanaitong.com
 */
@Mapper
public interface StudentMapper {

    List<StudentDO> list();

}
