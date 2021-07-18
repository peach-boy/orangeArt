package com.orangeart.protocal.request;


import com.orangeart.protocal.PageRequest;
import lombok.Data;

/**
 * @Description: 班级
 * @Auther: xiantao.wu
 * @Date: 2021/3/17 21:30
 * @Email:1414924381@qq.com
 */
@Data
public class FindClassRequest extends PageRequest {

    private Integer subjectId;

    private Integer status;

    private Integer type;

}
