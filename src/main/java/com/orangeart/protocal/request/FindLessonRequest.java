package com.orangeart.protocal.request;

import com.orangeart.protocal.PageRequest;
import lombok.Data;

/**
 * @Description: TODO
 * @Auther: xiantao.wu
 * @Date: 2021/3/17 21:30
 * @Email:1414924381@qq.com
 */
@Data
public class FindLessonRequest extends PageRequest {
    private String studentName;

    private Integer studentId;

    private Integer type;

    private Integer status;

    private String timeCreatedStart;

    private String timeCreatedEnd;


}
