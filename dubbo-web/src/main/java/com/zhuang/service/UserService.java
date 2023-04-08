package com.zhuang.service;

import com.zhuang.pojo.User;

/**
 * description: UserService
 * date: 2023/4/8 17:26
 * author: Zhuang
 * version: 1.0
 */
public interface UserService {

    String sayHello();

    /**
     * 查询用户
     */
    User findUserById(int id);
}
