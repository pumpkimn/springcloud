package com.example.hystrix.server;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: lee
 * @create: 2019/03/09 14:23
 */
@Service
public class TestService {

    @Autowired
    RestTemplate restTemplate;


    // 使用@HystrixCommand注解指定接口降级处理方法
    @HystrixCommand(fallbackMethod = "fallback")
    public String test() {
        return restTemplate.getForObject("http://EUREKA-CLIENT/stop", String.class);
    }


    @HystrixCommand(fallbackMethod = "fallback")
    public String test1() {
        return restTemplate.getForObject("http://EUREKA-CLIENT/stop", String.class);
    }


    public String fallback() {
        return "fallback";
    }


}
