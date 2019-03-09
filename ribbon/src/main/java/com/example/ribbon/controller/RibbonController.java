package com.example.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

/**
 * @description:
 * @author: lee
 * @create: 2019/03/09 13:34
 */
@RestController
public class RibbonController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return restTemplate.getForEntity("http://EUREKA-CLIENT/dc", String.class).getBody();
    }

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public String test1() {
        return restTemplate.getForEntity("http://EUREKA-CLIENT-HEALTH/dc", String.class).getBody();
    }

}
