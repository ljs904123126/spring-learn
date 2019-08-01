package com.yoyoyo666.test.spring.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BaoZhou
 * @date 2018/8/30
 */
@RestController
public class TestController {


    @Value("${server.port}")
    private int port;

    @GetMapping("/test")
    public String test() {
        return port + "";
    }

}
