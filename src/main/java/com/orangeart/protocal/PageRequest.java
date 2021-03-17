package com.orangeart.protocal;

/**
 * @Description: TODO
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 23:09
 * @Email:xiantao.wu@guanaitong.com
 */
public class PageRequest {
    private Integer pageNo = 1;
    private Integer pageSize = 20;
    private transient Integer offset;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getOffset() {
        return (pageNo - 1) * pageSize;
    }
}
