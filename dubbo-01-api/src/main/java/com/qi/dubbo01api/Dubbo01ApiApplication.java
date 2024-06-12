package com.qi.dubbo01api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * - @SpringBootApplication 是一个组合注解，包含以下三个注解：
 * 1. @SpringBootConfiguration: 标识这是一个 Spring Boot 配置类。
 * 2. @EnableAutoConfiguration: 启用 Spring Boot 的自动配置机制。
 * 3. @ComponentScan: 启用组件扫描，以便自动发现和注册 Spring 组件。
 */
@SpringBootApplication
public class Dubbo01ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(Dubbo01ApiApplication.class, args);
    }

}
