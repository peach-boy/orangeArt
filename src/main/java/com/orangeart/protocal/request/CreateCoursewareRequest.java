package com.orangeart.protocal.request;


import lombok.Data;

/**
 * @Description: 课件
 * @Auther: xiantao.wu
 * @Date: 2021/3/17 21:30
 * @Email:1414924381@qq.com
 */
@Data
public class CreateCoursewareRequest {
    private String coursewareName;

    private String remark;

}
