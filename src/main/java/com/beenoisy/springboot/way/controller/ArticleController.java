package com.beenoisy.springboot.way.controller;

import com.beenoisy.springboot.way.common.config.converter.support.Pager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "article")
public class ArticleController {

    @RequestMapping(method = RequestMethod.GET)
    public String getArticles(
            @RequestParam("pager") Pager pager// 1
    ) {
        int pageNo = pager.getPageNo();
        int pageSize = pager.getPageSize();

        return "pageNo is: " + pageNo + ", pageSize is: " + pageSize;
    }
}
