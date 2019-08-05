package main.com.learn.day.day2;

import main.com.learn.day.day2.yes.BWM;
import main.com.learn.day.day2.yes.ICar;
import main.com.learn.day.day2.yes.IDriver;

/**
 * 依赖倒置原则
 * 高层模块不应该依赖于底层模块，两者都应该依赖其抽象
 * 抽象不应该依赖细节
 * 细节应该依赖抽象
 *
 * 提高并行性 降低耦合性 提高可读性 可维护性
 *
 * 面向接口编程 - OOD
 *
 * ：一个接口多个实现
 */
public class Client {
    public static void main(String[] args) {
        Driver zhangsan = new Driver();
        Benz benz = new Benz();
        zhangsan.driver(benz);

        IDriver zs = new main.com.learn.day.day2.yes.Driver();
        ICar bwm = new BWM();
        zs.driver(bwm);
    }

    //如果要开宝马怎么办
}
