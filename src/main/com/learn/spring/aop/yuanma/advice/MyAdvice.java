package main.com.learn.spring.aop.yuanma.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAdvice {

    /**匹配方法签名:
     *
     * 匹配指定包中的所有的方法
     * execution(* com.xys.service.*(..))
     *
     * 匹配当前包中的指定类的所有方法
     * execution(* UserService.*(..))
     *
     * 匹配指定包中的所有 public 方法
     * execution(public * com.xys.service.*(..))
     *
     * 匹配指定包中的所有 public 方法, 并且返回值是 int 类型的方法
     * execution(public int com.xys.service.*(..))
     *
     * 匹配指定包中的所有 public 方法, 并且第一个参数是 String, 返回值是 int 类型的方法
     * execution(public int com.xys.service.*(String name, ..))
     *
     */

    /**匹配类型签名:
     *
     * 匹配指定包中的所有的方法, 但不包括子包
     * within(com.xys.service.*)
     *
     * 匹配指定包中的所有的方法, 包括子包
     * within(com.xys.service..*)
     *
     * 匹配当前包中的指定类中的方法
     * within(UserService)
     *
     * 匹配一个接口的所有实现类中的实现的方法
     * within(UserDao+)
     */

    /**匹配 Bean 名字:
     *
     * 匹配以指定名字结尾的 Bean 中的所有方法
     * bean(*Service)
     */


    /**切点表达式组合:
     * 匹配以 Service 或 ServiceImpl 结尾的 bean
     * bean(*Service || *ServiceImpl)
     *
     * 匹配名字以 Service 结尾, 并且在包 com.xys.service 中的 bean
     * bean(*Service) && within(com.xys.service.*)
     */



//    @Pointcut("@annotation(main.com.learn.spring.aop.yuanma.*)")
//    public void pointcut() {
//    }
//
//    @Pointcut("within(main.com.learn.spring.aop.yuanma.advice.*)")
//    public void pointCut1(){
//
//    }
//
//    @Before(value = "pointCut1() && args(..)")
//    public void doSomething(){
//        System.out.println("do something ...");
//    }
}
