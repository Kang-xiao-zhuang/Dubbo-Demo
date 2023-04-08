package com.zhuang.dubbo.client;

import com.zhuang.dubbo.api.GreetingsService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * description: Application
 * date: 2023/4/8 16:00
 * author: Zhuang
 * version: 1.0
 */
public class Application {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-demo-consumer.xml");
        context.start();
        GreetingsService greetingsService = (GreetingsService) context.getBean("greetingsService");

        String message = greetingsService.sayHi("dubbo");
        System.out.println("Receive result ======> " + message);
        System.in.read();
        System.exit(0);
    }
}
