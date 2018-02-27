package com.pctx.test.goodbye;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by chason on 2018/2/27.16:57
 */
@FeignClient(value = "eureka-client")
public interface HiService {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
