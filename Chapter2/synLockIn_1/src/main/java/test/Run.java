package test;

import extthread.MyThread;

/**
 * 单个类，非继承类的锁重入
 */
public class Run {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
