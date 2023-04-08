package com.zhuang.service.impl;

import com.zhuang.pojo.User;
import com.zhuang.service.UserService;
import org.apache.dubbo.config.annotation.Service;


//@Service  将该类对象创建出来放到 IOC容器中， bean定义
@Service // 将这个类提供的方法对外发布，将访问的地址ip端口，路径注册到注册中心
public class UserServiceImpl implements UserService {

    public String sayHello() {
        return "hello dubbo!~";
    }


    public User findUserById(int id) {
        return new User(1, "zhangsan", "123");
    }
}
