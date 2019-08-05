package main.com.learn.day.day4.impl;

import main.com.learn.day.day4.AbstractSearcher;
import main.com.learn.day.day4.IPettyGirl;

public class Searcher extends AbstractSearcher{

    public Searcher(IPettyGirl pettyGirl) {
        super(pettyGirl);
    }

    @Override
    public void show() {
        System.out.println("信息展示");
        super.iPettyGirl.goodLooking();
        super.iPettyGirl.niceFigure();
        super.iPettyGirl.greatTemperament();
    }
}
