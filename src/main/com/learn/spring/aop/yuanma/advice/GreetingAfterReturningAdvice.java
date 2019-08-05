package main.com.learn.spring.aop.yuanma.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class GreetingAfterReturningAdvice implements AfterReturningAdvice{
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        String clientName = (String) objects[0];
        System.out.println("Good bye.Mr " + clientName);
    }
}
