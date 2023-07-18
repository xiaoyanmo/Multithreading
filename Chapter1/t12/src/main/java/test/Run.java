package test;

import exthread.MyThread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Run {
    // 测试当前线程是否已经中断
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
//             Thread.currentThread().interrupt(); // 这个当前指的是main线程，而thread线程是否停止，没停止，所以打印两个false,实例方法调用的其实是Thread类静态方法，测试当前线程
            System.out.println("是否停止1？= " + thread.interrupted() + "\t" + Thread.interrupted());
            System.out.println("是否停止2？= " + thread.interrupted() + "\t" + Thread.interrupted());
            System.out.println("结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}

