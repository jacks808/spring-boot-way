package com.beenoisy.springboot.way.common.config.converter.support;

import org.springframework.core.convert.converter.Converter;

/**
 * pager object, format as :"pageNo,pageSize"
 * Created by jacks808@163.com on 16/9/15.
 */
public class PagerConverter implements Converter<String, Pager> {// 1

    public static final int PAGE_SIZE = 20;

    @Override
    public Pager convert(String s) {
        // 没有给正确的参数则取第一页
        if (s == null || s.length() == 0) {
            return new Pager(0, PAGE_SIZE);
        }

        String[] pagerSplit = s.split(",");

        if (pagerSplit.length != 2) {
            throw new IllegalStateException("can't parse '" + s + "' to pager, please input pager as pageNo,pageSize");
        }

        try {
            int pageNo = Integer.parseInt(pagerSplit[0]);
            int pageSize = Integer.parseInt(pagerSplit[1]);

            return new Pager(pageNo, pageSize); // 2
        } catch (NumberFormatException e) {
            throw new IllegalStateException("can't parse '" + s + "' to pager, please input pager as pageNo,pageSize");
        }
    }
}
