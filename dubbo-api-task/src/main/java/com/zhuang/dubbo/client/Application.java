package com.zhuang.dubbo.client;

import com.zhuang.dubbo.api.GreetingsService;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;

import java.io.IOException;

import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;

/**
 * description: Application
 * date: 2023/4/8 20:21
 * author: Zhuang
 * version: 1.0
 */
public class Application {
    public static void main(String[] args) throws IOException {
        ReferenceConfig<GreetingsService> reference = new ReferenceConfig<>();
        reference.setInterface(GreetingsService.class);

        DubboBootstrap.getInstance()
                .application("first-dubbo-consumer")
                .registry(new RegistryConfig("zookeeper://127.0.0.1:2181"))
                .reference(reference);

        GreetingsService service = reference.get();
        String message = service.sayHi("dubbo");
        System.out.println("Receive result ======> " + message);
        System.in.read();
    }
}
