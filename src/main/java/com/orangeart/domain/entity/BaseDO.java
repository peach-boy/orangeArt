package com.orangeart.domain.entity;

import java.util.Date;

/**
 * @Description: DO基类
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 22:30
 * @Email:xiantao.wu@guanaitong.com
 */
public class BaseDO {
    private Integer id;

    private Date timeCreated;

    private Date timeModified;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
