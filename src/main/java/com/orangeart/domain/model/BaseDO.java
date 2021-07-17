package com.orangeart.domain.model;

import java.util.Date;

/**
 * @Description: DO基类
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 22:30
 * @Email:1414924381@qq.com
 */

public class BaseDO {

    private Date timeCreated;

    private Date timeModified;

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public Date getTimeModified() {
        return timeModified;
    }

    public void setTimeModified(Date timeModified) {
        this.timeModified = timeModified;
    }
}
