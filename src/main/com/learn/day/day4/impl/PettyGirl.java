package main.com.learn.day.day4.impl;

import main.com.learn.day.day4.IPettyGirl;

public class PettyGirl implements IPettyGirl{
    @Override
    public void goodLooking() {
        System.out.println("好看...");
    }

    @Override
    public void niceFigure() {
        System.out.println("好身材...");
    }

    @Override
    public void greatTemperament() {
        System.out.println("有气质...");
    }
}
