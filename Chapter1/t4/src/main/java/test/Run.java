package test;

import mythread.MyThread;

public class Run {
    public static void main(String[] args) {
        MyThread mythread = new MyThread();

        // 5个线程，操作同一个线程实例,5个不同的实例
        Thread a = new Thread(mythread, "A");
        Thread b = new Thread(mythread, "B");
        Thread c = new Thread(mythread, "C");
        Thread d = new Thread(mythread, "D");
        Thread e = new Thread(mythread, "E");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
