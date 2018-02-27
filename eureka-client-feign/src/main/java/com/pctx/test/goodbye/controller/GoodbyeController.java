package com.pctx.test.goodbye.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chason on 2018/2/27.15:54
 */
@RestController
@EnableEurekaClient
public class GoodbyeController {
    @Value("${server.port}")
    String port;

    @RequestMapping(value = "say")
    public String hello(@RequestParam(value = "name" ,required = false) String name){
        return "goodbye " + name + ";I am from " + port;
    }
}
