package com.pctx.test.feign.controller;

import com.pctx.test.feign.service.SchedualServiceBye;
import com.pctx.test.feign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chason on 2018/2/26.17:46
 */
@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @Autowired
    SchedualServiceBye schedualServiceBye;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }

    @RequestMapping(value = "/bye", method = RequestMethod.GET)
    public String sayBye(@RequestParam String name) {
        return schedualServiceBye.sayByeFromClientOne(name);
    }
}
