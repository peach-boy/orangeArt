package com.orangeart.constant;

/**
 * 学员状态
 */
public enum StatusEnum {
    NO(0,"否"),
    YES(1,"是");

    private Integer status;

    private String desc;


    StatusEnum(Integer status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
