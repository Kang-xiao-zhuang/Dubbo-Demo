package com.zhuang.service;

import com.zhuang.pojo.User;

public interface UserService {


    String sayHello();

    /**
     * 查询用户
     */
    User findUserById(int id);
}
