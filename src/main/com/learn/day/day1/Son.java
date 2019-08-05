package main.com.learn.day.day1;

import java.util.Collection;
import java.util.Map;

public class Son extends Father{
    //放大参数类型  注：非重写 是重载（不在一个类）
    public Collection doSomething(Map map){
        System.out.println("zi lei");
        return map.values();
    }
}
