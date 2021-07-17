package com.orangeart.domain.model;

import lombok.Data;

import java.util.Date;

/**
 * @Description: TODO
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 22:22
 * @Email:1414924381@qq.com
 */
@Data
public class StudentDO extends BaseDO {
    private String name;

    private Date birthYear;

    private String address;

    private String mobile;

    private Integer gender;

    private Integer channel;

    private Integer status;

    private String remark;


}
