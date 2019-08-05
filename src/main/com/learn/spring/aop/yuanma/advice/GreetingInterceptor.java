package main.com.learn.spring.aop.yuanma.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class GreetingInterceptor implements MethodInterceptor{
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object[] objects = methodInvocation.getArguments(); //目标方法入参
        String name = (String) objects[0];
        System.out.println("How are you . Mr " + name + " .."); //在目标方法执行前调用

        Object object = methodInvocation.proceed();   //通过反射机制调用目标方法
        System.out.println("Good bye . Mr " + name + " ..");
        return object;
    }
}
