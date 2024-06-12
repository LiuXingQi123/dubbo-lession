package com.qi.dubbo03consumer.controller;

import com.qi.dubbo01api.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @DubboReference(url = "dubbo://192.168.0.103:20880/com.qi.dubbo01api.service.UserService")
    private UserService userService;

    @PostMapping("/user/{logingName}/{password}")
    public String queryTitlePage(@PathVariable("logingName") String logingName, @PathVariable("password") String password) {
        String login = userService.login(logingName, password);
        System.out.println("由服务消费者03-consumer打印" + login);
        return "消费者03-consumer调用结果" + login;
    }

}
