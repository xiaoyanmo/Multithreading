package test;

import extthread.MyThreadA;
import extthread.MyThreadB;
import service.MyService;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        MyService myService = new MyService();
        MyThreadA a = new MyThreadA(myService);
        a.start();
        Thread.sleep(50);
        MyThreadB b = new MyThreadB(myService);
        b.start();

    }

}
