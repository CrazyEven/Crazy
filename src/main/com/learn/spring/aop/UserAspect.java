package main.com.learn.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/*
    声明一个切面
 */
@Aspect
public class UserAspect {

    /**
     * 声明一个切点
     */
    @Pointcut("execution(* main.com.learn.spring.aop.impl.*.* (..))")
    public void addLog(){
        System.out.println("---------");
    }
}
