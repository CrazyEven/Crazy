package main.com.learn.day.day2.yes;

public class Driver implements IDriver{
    @Override
    public void driver(ICar car) {
        System.out.println("driver...");
        car.run();
    }
}
