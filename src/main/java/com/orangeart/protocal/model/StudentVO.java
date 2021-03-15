package com.orangeart.protocal.model;


/**
 * @Description: TODO
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 23:17
 * @Email:xiantao.wu@guanaitong.com
 */
public class StudentVO {
    private Integer id;

    private String name;

    private Integer usedQuantity;

    private Integer unusedQuantity;

    private Integer status;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUsedQuantity() {
        return usedQuantity;
    }

    public void setUsedQuantity(Integer usedQuantity) {
        this.usedQuantity = usedQuantity;
    }

    public Integer getUnusedQuantity() {
        return unusedQuantity;
    }

    public void setUnusedQuantity(Integer unusedQuantity) {
        this.unusedQuantity = unusedQuantity;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
