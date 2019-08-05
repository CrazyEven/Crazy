package main.com.learn.day.day4;

import main.com.learn.day.day4.impl.PettyGirl;
import main.com.learn.day.day4.impl.Searcher;

public class Client {

    public static void main(String[] args) {
        IPettyGirl liulili = new PettyGirl();
        AbstractSearcher searcher = new Searcher(liulili);
        searcher.show();
    }
}
