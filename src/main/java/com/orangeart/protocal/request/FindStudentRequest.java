package com.orangeart.protocal.request;

import com.orangeart.protocal.PageRequest;

/**
 * @Description: TODO
 * @Auther: xiantao.wu
 * @Date: 2021/3/17 21:30
 * @Email:xiantao.wu@guanaitong.com
 */
public class FindStudentRequest extends PageRequest {
    private String name;

    private Integer status;

    private String timeCreatedStart;

    private String timeCreatedEnd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTimeCreatedStart() {
        return timeCreatedStart;
    }

    public void setTimeCreatedStart(String timeCreatedStart) {
        this.timeCreatedStart = timeCreatedStart;
    }

    public String getTimeCreatedEnd() {
        return timeCreatedEnd;
    }

    public void setTimeCreatedEnd(String timeCreatedEnd) {
        this.timeCreatedEnd = timeCreatedEnd;
    }
}
