package main.com.learn.thread;

public class MySyncThread extends Thread {

    private int count = 5;

    public MySyncThread() {
    }

    public MySyncThread(String name) {
        this.setName(name);
    }

    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println("threadName: " + this.currentThread().getName() + " count: " + count);

    }
}
