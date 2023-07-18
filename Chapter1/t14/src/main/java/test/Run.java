package test;

import exthread.MyThread;

import java.util.logging.Logger;

public class Run {

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            // 即先调用interrupt()方法，再调用sleep()方法，这种情况下也会出现异常
            Thread.sleep(200);
            thread.interrupt();
        } catch (InterruptedException e) {
            Logger.getGlobal().info("main catch");
            Thread.currentThread().interrupt();
        }
        Logger.getGlobal().info("end!");
    }

}
