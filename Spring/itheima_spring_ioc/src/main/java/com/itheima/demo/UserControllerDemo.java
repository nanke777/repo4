package com.itheima.demo;

import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserControllerDemo {
    public static void main(String[] args) {
        ApplicationContext  app=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService= (UserService) app.getBean("userService");
        userService.save();
    }
}
