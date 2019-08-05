package main.com.learn.spring.aop.impl;

import org.springframework.stereotype.Service;

@Service
public class UserServiceAop {

    public void learnChinese(){
        System.out.println("john正在学习汉语...");
    }
}
