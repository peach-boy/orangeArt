package com.orangeart.protocal.request;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description: TODO
 * @Auther: xiantao.wu
 * @Date: 2021/3/17 21:30
 * @Email:1414924381@qq.com
 */
@Data
public class CreateClassRequest {
    private Integer weekDay;

    private String beginTime;

    private String endTime;

    private Integer subjectId;

    private String remark;

    private Integer type;
}
