package main.com.learn.spring.aop.yuanma.another;

import main.com.learn.spring.user.po.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;


@Aspect
@Component
public class MineAdivce {
    private Logger logger = LoggerFactory.getLogger(getClass());

    //@Before("execution(* main.com.learn.spring.aop.yuanma.*.* (..))")
//    @Before("within(main.com.learn.spring.aop.yuanma.advice.*)")
//    public void doSomething(JoinPoint joinPoint) {
//        System.out.println("*****Before advise, method: " + joinPoint.getSignature().toShortString() + " *****");
//        System.out.println("------------");
//        logger.info("织入代码");
//    }

    @Before("execution(* main.com.learn.spring.aop.yuanma..*.* (..))")
    public void doSomething(JoinPoint joinPoint) {
        System.out.println("*****Before advise, method: " + joinPoint.getSignature().toShortString() + " *****");
        System.out.println("------------");
        logger.info("织入代码");
    }

    @Before("@annotation(main.com.learn.spring.aop.yuanma.utils.AllTest)")
    public void doAnyThing(JoinPoint joinPoint) {
        System.out.println("*****Before advise, method: " + joinPoint.getSignature().toShortString() + " *****");

        if (joinPoint.getArgs()[0] instanceof User) {
            User user = (User) joinPoint.getArgs()[0];
            if (StringUtils.isEmpty(user.getUserId())) {
                System.out.println("userId不能为空!");
            } else {
                System.out.println("- yes --");
            }
        }
    }

    @Around("@annotation(main.com.learn.spring.aop.yuanma.utils.AllTest)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("*****Before advise, method: " + joinPoint.getSignature().toShortString() + " *****");

        if (joinPoint.getArgs()[0] instanceof User) {
            User user = (User) joinPoint.getArgs()[0];
            if (StringUtils.isEmpty(user.getPassword())) {
                System.out.println("Password不能为空!");
            } else {
                System.out.println("- yes --");
            }
        }
        return joinPoint.proceed();
    }


//    @Before("within(main.com.learn.spring.aop.yuanma.advice.*)")
//    public void doSomething() {
//        System.out.println("------------");
//        logger.info("织入代码");
//    }
}
