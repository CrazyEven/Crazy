package main.com.learn.day.day1;

import java.util.HashMap;

public class Client {

    public static void invoker(){
        Father f = new Father();
        HashMap hashMap = new HashMap();
        f.doSomething(hashMap);
    }

    //里氏替换原则 有父类的地方就可以使用子类
    public static void invoker1(){
        Son son = new Son();
        HashMap map = new HashMap();
        son.doSomething(map);
    }

    public static void main(String[] args) {
        invoker();

        invoker1();
    }

    /**
     * 子类重写父类方法 输入参数范围要小于等于父类  如果是重载时 输入参数是宽于父类的 则是不会被调用的
     */
}
