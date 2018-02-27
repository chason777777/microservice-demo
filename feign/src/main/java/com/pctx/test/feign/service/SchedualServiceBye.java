package com.pctx.test.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by chason on 2018/2/26.17:46
 */
@FeignClient(value = "goodbye")
public interface SchedualServiceBye {
    @RequestMapping(value = "/say", method = RequestMethod.GET)
    String sayByeFromClientOne(@RequestParam(value = "name") String name);
}
