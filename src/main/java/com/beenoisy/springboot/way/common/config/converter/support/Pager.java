package com.beenoisy.springboot.way.common.config.converter.support;

public class Pager {
    private int pageNo;
    private int pageSize;

    public Pager(int pageNo, int pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    @Override
    public String toString() {
        return "Pager{" +
                "pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                '}';
    }
}
