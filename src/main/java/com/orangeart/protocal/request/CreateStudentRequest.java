package com.orangeart.protocal.request;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Description: TODO
 * @Auther: xiantao.wu
 * @Date: 2021/3/17 21:30
 * @Email:1414924381@qq.com
 */
@Data
public class CreateStudentRequest {
    private String name;

    private String birthYear;

    private String address;

    private String mobile;

    private Integer gender;

    private Integer channel;

    private String remark;


}
