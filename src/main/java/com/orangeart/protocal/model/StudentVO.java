package com.orangeart.protocal.model;


import lombok.Data;

/**
 * @Description: TODO
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 23:17
 * @Email:1414924381@qq.com
 */
@Data
public class StudentVO {
    private Integer id;

    private String name;

    private Integer usedQuantity;

    private Integer unusedQuantity;

    private Integer status;

    private String remark;


}
