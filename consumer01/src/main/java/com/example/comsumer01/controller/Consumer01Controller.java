package com.example.comsumer01.controller;

import com.example.comsumer01.service.Consumer01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.example.provider01.controller
 *
 * @author xiaozhiwei
 * 2023/4/6
 * 22:25
 */
@RestController
public class Consumer01Controller {

    @Autowired
    Consumer01Service Consumer01Service;

    @GetMapping("method1")
    String method1() {
        return Consumer01Service.method2();
    }

}
