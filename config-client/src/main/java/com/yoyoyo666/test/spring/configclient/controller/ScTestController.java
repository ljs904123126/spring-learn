package com.yoyoyo666.test.spring.configclient.controller;


import com.yoyoyo666.test.spring.configclient.service.ScTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author pym
 * @since 2019-07-21
 */
@RestController
@RequestMapping("/scTest")
public class ScTestController {

    @Autowired
    private ScTestService scTestService;

    @GetMapping("list")
    public Object getList(){
        return scTestService.list();
    }
}

