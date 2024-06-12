package com.qi.dubbo02provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * - @SpringBootApplication 是一个组合注解，包含以下三个注解：
 * 1. @SpringBootConfiguration: 标识这是一个 Spring Boot 配置类。
 * 2. @EnableAutoConfiguration: 启用 Spring Boot 的自动配置机制。
 * 3. @ComponentScan: 启用组件扫描，以便自动发现和注册 Spring 组件。
 */
@SpringBootApplication

/**
 * EnableDubbo 注解用于启用 Dubbo 服务或引用 Dubbo 服务。
 *
 * 1.当将此注解添加到 Spring Boot 的主类或其他配置类上时，它将自动配置 Dubbo 所需的各种组件，
 *   如 Dubbo 服务导出、服务引用、协议配置、注册中心等。
 * 2.该注解通常与 Dubbo 的相关配置属性一起使用，以进一步定制 Dubbo 的行为。
 *   这些配置属性可以在 application.properties 或 application.yml 文件中定义。
 * 3.注意：在使用此注解之前，请确保已将 Dubbo 的相关依赖项添加到项目的构建配置中。
 *
 */
@EnableDubbo
public class Dubbo02ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Dubbo02ProviderApplication.class, args);
    }

}
