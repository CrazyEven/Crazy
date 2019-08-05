package main.com.learn.day.day4;

public abstract class AbstractSearcher {

    protected IPettyGirl iPettyGirl;

    public AbstractSearcher(IPettyGirl pettyGirl){
        this.iPettyGirl = pettyGirl;
    }

    public abstract void show();
}
