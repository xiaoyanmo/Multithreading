package test;

import extthread.MyThread1;

import java.util.logging.Logger;

public class Run {
    // 在Java中，线程的优先级具有继承性，例如，A线程启动B线程，则B线程的优先级与A线程是一样的
    public static void main(String[] args) {
        Logger.getGlobal().info("main thread begin priority="
                + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        Logger.getGlobal().info("main thread end   priority="
                + Thread.currentThread().getPriority());
        MyThread1 thread1 = new MyThread1();
        thread1.start();
    }
}
