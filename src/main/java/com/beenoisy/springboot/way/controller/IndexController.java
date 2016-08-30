package com.beenoisy.springboot.way.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by BeeNoisy on 16/8/13.
 */
@RestController
public class IndexController {
    @RequestMapping(value = "/")
    public String index() {
        return "Hello Spring boot";
    }
}
