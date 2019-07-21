package com.yoyoyo666.test.spring.bus.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
public class BusController {

    @Value("${test.name}")
    private String env;

    @GetMapping("/env")
    public String getEnv()
    {
        return env;
    }

}
