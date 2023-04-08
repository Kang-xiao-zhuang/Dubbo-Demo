package com.zhuang.service;

import com.zhuang.pojo.User;

public interface UserService {

    String sayHello();

    User findUserById(int id);
}
