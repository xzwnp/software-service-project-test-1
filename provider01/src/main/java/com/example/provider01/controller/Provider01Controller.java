package com.example.provider01.controller;

import com.example.provider01.service.Provider01Service;
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
public class Provider01Controller {

    @Autowired
    Provider01Service provider01Service;

    @GetMapping("method1")
    String method1(@RequestParam String name) {
        return provider01Service.method1(name);
    }

}
