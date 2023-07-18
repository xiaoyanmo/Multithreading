package test;

import extthread.MyThread1;
import extthread.MyThread2;

public class RunCustomer {

    // NEW,
    // RUNNABLE,
    // TERMINATED,
    // BLOCKED,
    // WAITING,
    // TIMED_WAITING,

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.setName("a");
        System.out.println("main方法中的t1状态：" + t1.getState());
        t1.start();
        System.out.println("main方法中的t1状态：" + t1.getState());

        MyThread2 t2 = new MyThread2();
        t2.setName("b");
        System.out.println("main方法中的t2状态：" + t2.getState());
        t2.start();
        System.out.println("main方法中的t2状态：" + t2.getState());

        System.out.println("main方法中的t1状态：" + t1.getState());
        System.out.println("main方法中的t2状态：" + t2.getState());

    }
}
