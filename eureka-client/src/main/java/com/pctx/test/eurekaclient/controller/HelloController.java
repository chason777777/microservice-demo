package com.pctx.test.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chason on 2018/2/26.17:38
 */
@RestController
@EnableEurekaClient
public class HelloController {
    @Value("${server.port}")
    String port;

    @RequestMapping(value = "hello")
    public String hello(@RequestParam(value = "name" ,required = false) String name){
        return "hello " + name + ";I am from " + port;
    }
}
