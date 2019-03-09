package com.example.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:
 * @author: lee
 * @create: 2019/03/09 14:09
 */
@FeignClient("eureka-client")
public interface TestService {
    //通过注解指定访问方式，访问路径、访问参数
    @RequestMapping(method = RequestMethod.GET,value = "add")
    Integer add(@RequestParam(value ="a")Integer a,@RequestParam(value = "b")Integer b);
}
