package org.example;

public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        // 耗时大
        myThread.start();
        // 耗时小
        System.out.println("运行结束");
    }
}
