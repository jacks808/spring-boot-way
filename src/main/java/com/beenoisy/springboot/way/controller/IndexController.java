package com.beenoisy.springboot.way.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by BeeNoisy on 16/8/13.
 */
@RestController
public class IndexController {
    @RequestMapping(value = "/")
    public void index(
            HttpServletRequest request, //1
            HttpServletResponse response // 2
    ) throws IOException {
        String ua = request.getHeader("User-Agent");// 3

        PrintWriter writer = response.getWriter(); // 4
        writer.write("Hello Spring boot, your user agetn is : " + ua); // 5

        writer.flush();// 6
    }
}
