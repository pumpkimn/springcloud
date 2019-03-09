package com.example.eurekadiscoveryhealth.controller;

import com.example.eurekadiscoveryhealth.config.MyHealthIndicator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: lee
 * @create: 2019/03/09 13:24
 */
@RestController
public class HealthController {

    @Autowired
    MyHealthIndicator myHealthIndicator;

    @RequestMapping("up")
    public String up(@RequestParam("up")Boolean up){
        myHealthIndicator.setUp(up);
        return up.toString();
    }
}
