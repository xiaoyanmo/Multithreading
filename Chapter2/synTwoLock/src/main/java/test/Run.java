package test;

import extthread.ThreadA;
import extthread.ThreadB;
import extthread.ThreadC;
import service.Service;

/**
 * synchronized关键字加到
 * static静态方法上的方式是将Class类对象作为锁，而
 * synchronized关键字加到非static静态方法上的方式
 * 是将方法所在类的对象作为锁
 */
public class Run {

    public static void main(String[] args) {

        Service service = new Service();

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();

        ThreadC c = new ThreadC(service);
        c.setName("C");
        c.start();

    }

}
