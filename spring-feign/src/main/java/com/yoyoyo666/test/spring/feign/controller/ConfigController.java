package com.yoyoyo666.test.spring.feign.controller;

import com.yoyoyo666.test.spring.feign.service.TestFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BaoZhou
 * @date 2018/8/30
 */
@RestController
public class ConfigController {

    @Autowired
    TestFeignService testFeignService;


    @GetMapping("/env")
    public String getEnv() {
        return testFeignService.testPython();
    }

}
