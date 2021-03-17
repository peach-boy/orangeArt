package com.orangeart.domain.model;

/**
 * @Description: TODO
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 22:22
 * @Email:xiantao.wu@guanaitong.com
 */
public class StudentDO extends BaseDO {
    private String name;

    private String birthYear;

    private String address;

    private String mobile;

    private Integer gender;

    private Integer channel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }
}
