package org.example;

public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        // 耗时大
        myThread.start();
        Thread.sleep(200);
        // 耗时小
        System.out.println("运行结束");
    }
}
