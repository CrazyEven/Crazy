package main.com.learn.thread;

public class MyThread extends Thread {
    private String name = "";
    private int count = 5;

    public MyThread() {
    }

    public MyThread(String name) {
        super();
        this.name = name;
    }

    @Override
    public void run() {
        super.run();
        count--;
        System.out.println("name: " + name);
        System.out.println("threadName: " + this.currentThread().getName() + " count: " + count);
    }
}
