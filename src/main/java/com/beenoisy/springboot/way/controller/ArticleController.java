package com.beenoisy.springboot.way.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController// 1
@RequestMapping(value = "article") // 2
public class ArticleController {

    @RequestMapping(method = RequestMethod.GET) // 3
    public Map<String, String> getArticle(
            @RequestParam("id") int id// 4
    ) {
        Map<String, String> result = new HashMap<>();           // 5
        result.put("title", "this is article of id " + id);     // 5
        result.put("content", "this is article of id " + id);   // 5
        return result;
    }
}
