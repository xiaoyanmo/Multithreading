package test;

import extthread.MyThreadA;
import extthread.MyThreadB;
import tools.Tools;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws
            InterruptedException {
        MyThreadA a = new MyThreadA();
        MyThreadB b = new MyThreadB();
        a.start();
        b.start();
        for (int i = 0; i < 10; i++) {
            Tools.tl.set("main " + (i + 1));
            System.out.println(" main get " +
                    Tools.tl.get());
            int sleepValue = (int) (Math.random() * 1000);
            Thread.sleep(sleepValue);
        }
    }
}