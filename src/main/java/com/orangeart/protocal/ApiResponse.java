package com.orangeart.protocal;

import java.io.Serializable;

/**
 * @Description: TODO
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 22:50
 * @Email:xiantao.wu@guanaitong.com
 */
public class ApiResponse<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private int code;
    private String msg;
    private T data;

    public ApiResponse() {
    }

    public static <T> ApiResponse<T> success(T data) {
        ApiResponse<T> apiResponse = new ApiResponse();
        apiResponse.setCode(0000);
        apiResponse.setMsg("ok");
        apiResponse.setData(data);
        return apiResponse;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
