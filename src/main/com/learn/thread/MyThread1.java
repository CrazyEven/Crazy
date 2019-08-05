package main.com.learn.thread;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        super.run();
        this.setName("myThread1...");
    }
}
