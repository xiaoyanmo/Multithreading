package test;

import extthread.ThreadA;
import service.MyService;

public class Run {

    public static void main(String[] args) {

        MyService service = new MyService();

        ThreadA a = new ThreadA(service);
        a.start();

    }

}
