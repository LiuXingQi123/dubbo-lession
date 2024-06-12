package com.qi.dubbo02provider.service;

import com.qi.dubbo01api.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

@DubboService
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String login(String loginName, String password) {
        System.out.println("loginName:" + loginName + ",password:" + password);
        return "@DubboService---provider-02消费者实现方法";
    }
}
