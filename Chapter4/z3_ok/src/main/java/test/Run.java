package test;

import extthread.MyThreadA;
import service.MyService;

public class Run {

    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThreadA a = new MyThreadA(myService);
        a.start();
    }
}
