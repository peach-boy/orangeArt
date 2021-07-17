package com.orangeart.protocal;

import java.io.Serializable;
import java.util.List;

/**
 * @Description: TODO
 * @Auther: xiantao.wu
 * @Date: 2021/3/15 22:52
 * @Email:1414924381@qq.com
 */
public class Pagination<T> implements Serializable {
    public static final int DEFAULT_PAGE_NUM = 1;
    public static final int DEFAULT_PAGE_SIZE = 20;
    public static final int MAX_PAGE_SIZE = 200;
    private static final long serialVersionUID = 1L;
    private List<T> data;
    private long totalCount;
    private int pageSize;
    private int pageNo;
    private long totalPage;

    public Pagination() {
    }

    public Pagination(long totalCount, List<T> data, PageRequest request) {
        this.totalCount = totalCount;
        this.data = data;
        this.pageNo = request.getPageNo();
        this.pageSize = request.getPageSize();
        this.totalPage = totalCount / pageSize + (totalCount % pageSize == 0 ? 0 : 1);
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

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

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }
}