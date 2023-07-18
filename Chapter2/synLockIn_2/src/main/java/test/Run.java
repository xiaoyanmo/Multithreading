package test;

import extthread.MyThread;

/**
 * 继承类中的锁重入，锁重入支持继承的环境
 */
public class Run {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
