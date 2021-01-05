package com.yoyoyo666.test.spring.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "ljs-python-test")
public interface TestFeignService {

    @RequestMapping(value = "/test/python")
    String testPython();

}
