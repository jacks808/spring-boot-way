package com.beenoisy.springboot.way.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by BeeNoisy on 16/8/23.
 */

@SpringBootApplication
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)// 1
public class IndexControllerTest {

    private MockMvc mockMvc;// 2

    @Autowired
    private WebApplicationContext webApplicationContext; // 3

    @Before
    public void before() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build(); // 4
    }

    @Test
    public void testIndex() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/")).andReturn(); // 5

        int status = mvcResult.getResponse().getStatus(); // 6
        String responseString = mvcResult.getResponse().getContentAsString(); // 7

        Assert.assertEquals("return status not equals 200", 200, status); // 8
        Assert.assertEquals("response string not equalse ", "Hello Spring boot", responseString); // 9
    }
}