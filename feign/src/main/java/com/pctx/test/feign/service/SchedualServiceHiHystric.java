package com.pctx.test.feign.service;

import org.springframework.stereotype.Component;

/**
 * Created by chason on 2018/2/26.17:47
 */
@Component
public class SchedualServiceHiHystric  implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
