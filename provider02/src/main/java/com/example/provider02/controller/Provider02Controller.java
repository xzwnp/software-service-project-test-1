package com.example.provider02.controller;

import com.example.provider02.service.Provider02Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.example.provider01.controller
 *
 * @author xiaozhiwei
 * 2023/4/6
 * 22:25
 */
@RestController
public class Provider02Controller {

    @Autowired
    Provider02Service provider01Service;

    @GetMapping("method2")
    String method1(@RequestParam String name) {
        return provider01Service.method2(name);
    }

}
