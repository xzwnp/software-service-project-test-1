package com.example.provider01.service;

import com.example.common.ServiceProvider01;
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
public class Provider01Service implements ServiceProvider01 {
    @Override
    public String method1(String name) {
        return "来自 Provider01: 你好," + name;
    }

}
