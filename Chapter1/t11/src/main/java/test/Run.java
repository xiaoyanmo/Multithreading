package test;

import exthread.MyThread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
        System.out.println("zzzzzzzzzz");
    }

}
