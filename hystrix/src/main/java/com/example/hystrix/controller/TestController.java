package com.example.hystrix.controller;

import com.example.hystrix.server.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: lee
 * @create: 2019/03/09 14:22
 */
@RestController
public class TestController {
    @Autowired
    TestService testService;
    @Autowired
    RestTemplate restTemplate;


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return testService.test();
    }


    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public String test1() {
        return testService.test1();
    }


    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public String test2() {
        return restTemplate.getForObject("http://EUREKA-CLIENT/stop", String.class);
    }





}
