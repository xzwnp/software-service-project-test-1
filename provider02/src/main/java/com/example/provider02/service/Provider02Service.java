package com.example.provider02.service;

import com.example.common.ServiceProvider02;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * com.example.demo1.service
 *
 * @author xiaozhiwei
 * 2023/4/6
 * 21:32
 */
@Service
@DubboService
public class Provider02Service implements ServiceProvider02 {
    @Override
    public String method2(String name) {
        return "from Provider02: Hello," + name;
    }

}
