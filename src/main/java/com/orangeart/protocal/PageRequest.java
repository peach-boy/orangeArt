package com.orangeart.protocal;

/**
 * @Description: TODO
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 23:09
 * @Email:xiantao.wu@guanaitong.com
 */
public class PageRequest {
    private int pageSize;
    private int pageNo;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }
}
