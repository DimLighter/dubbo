package com.hhg.jerry;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lining on 2018/10/25.
 */
public class InvokerServer {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        System.out.println("consumer start");
        UserService userService = context.getBean(UserService.class);
        System.out.println(userService.getDummyUser());
    }
}
