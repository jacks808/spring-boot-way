package com.beenoisy.springboot.way.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by BeeNoisy on 16/8/13.
 */
@RestController //1
public class IndexController {
    @RequestMapping(value = "/") // 2
    public String index() {
        return "Hello Spring boot"; // 3
    }
}
