package com.example.feign.controller;

import com.example.feign.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: lee
 * @create: 2019/03/09 14:11
 */
@RestController
public class TestController {
    @Autowired
    TestService testService;

    @GetMapping("/test")
    public Integer test() {
        return testService.add(12, 6);
    }

}
