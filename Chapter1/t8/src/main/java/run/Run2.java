package run;

import mythread.MyThread2;

/**
 * 异步返回响应信息，
 */
public class Run2 {
    public static void main(String[] args) {
        Thread myThread = new MyThread2();
        myThread.setName("A");
        System.out.println("begin = " + System.currentTimeMillis());
        myThread.start();
        System.out.println("end = " + System.currentTimeMillis());
    }
}
