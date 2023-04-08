package com.zhuang.dubbo.provider;

import com.zhuang.dubbo.api.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * description: DemoServiceImpl
 * date: 2023/4/8 20:08
 * author: Zhuang
 * version: 1.0
 */
@DubboService
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
