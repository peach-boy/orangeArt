package com.orangeart.constant;

/**
 * 学员状态
 */
public enum StudentStatusEnum {
    NEED_PAY(1,"未开始"),
    PROCESSING(2,"进行中"),
    DISMISS(3,"已结课");

    private Integer status;

    private String desc;


    StudentStatusEnum(Integer status, String desc) {
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
