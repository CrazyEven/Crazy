package main.com.learn.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAdvice {

    @Before("main.com.learn.spring.aop.UserAspect.addLog()")
    public void before(){
        System.out.println("LogAdvice before advice ");

    }
}
