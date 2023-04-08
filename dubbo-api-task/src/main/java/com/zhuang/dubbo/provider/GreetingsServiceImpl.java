package com.zhuang.dubbo.provider;

import com.zhuang.dubbo.api.GreetingsService;

/**
 * description: GreetingsServiceImpl
 * date: 2023/4/8 20:20
 * author: Zhuang
 * version: 1.0
 */
public class GreetingsServiceImpl implements GreetingsService {
    @Override
    public String sayHi(String name) {
        return "hi, " + name;
    }
}
