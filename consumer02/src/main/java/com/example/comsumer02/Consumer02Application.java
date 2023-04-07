package com.example.comsumer02;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * PACKAGE_NAME
 *
 * @author xiaozhiwei
 * 2023/3/1
 * 15:33
 */
@SpringBootApplication
@EnableDubbo
public class Consumer02Application {
    public static void main(String[] args) {
        SpringApplication.run(Consumer02Application.class, args);
    }
}
