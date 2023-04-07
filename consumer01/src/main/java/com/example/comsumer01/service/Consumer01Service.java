package com.example.comsumer01.service;

import com.example.common.ServiceProvider02;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * com.example.demo1.service
 *
 * @author xiaozhiwei
 * 2023/4/6
 * 21:32
 */
@Service
public class Consumer01Service {
    @DubboReference
    ServiceProvider02 provider02Service;

    public String method2() {
        return provider02Service.method2("Consumer01");
    }

}
