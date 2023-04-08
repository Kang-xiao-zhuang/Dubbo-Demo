package com.zhuang.controller;

import com.zhuang.pojo.User;
import com.zhuang.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    // 从zookeeper注册中心获取userService的访问url
    // 远程调用rpc
    // 将结果封装为一个代理对象，给变量赋值

    //注入Service
    //@Autowired
    @Reference // 远程注入
    private UserService userService;

    @RequestMapping("/sayHello")
    public String sayHello() {
        return userService.sayHello();
    }


    @RequestMapping("/find")
    public User sayHello(int id) {
        return userService.findUserById(id);
    }
}

