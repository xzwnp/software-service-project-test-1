package com.example.comsumer02.controller;

import com.example.comsumer02.service.Consumer02Service;
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
public class Consumer02Controller {

    @Autowired
    Consumer02Service consumer02Service;

    @GetMapping("method2")
    String method1() {
        return consumer02Service.method2();
    }

}
