package test;

import extthread.ThreadA;
import extthread.ThreadB;
import service.Service;

/**
 * 同步syn static方法可以对类的
 * 所有对象实例起作用
 * Class锁可以对类的所有对象实例起作用
 */
public class Run {

    public static void main(String[] args) {

        Service service1 = new Service();
        Service service2 = new Service();

        ThreadA a = new ThreadA(service1);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(service2);
        b.setName("B");
        b.start();

    }

}
