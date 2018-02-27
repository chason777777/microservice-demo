package com.pctx.test.goodbye.controller;

import com.pctx.test.goodbye.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chason on 2018/2/27.16:56
 */
@RestController
public class HiController {
    @Autowired
    HiService hiService;

    @RequestMapping("hi")
    public String sayHi(String name){
        return hiService.sayHiFromClientOne(name);
    }
}
