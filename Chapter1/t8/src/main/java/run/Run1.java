package run;

import mythread.MyThread1;

public class Run1 {

    public static void main(String[] args) {

        Thread myThread = new MyThread1();
        myThread.setName("A");
        System.out.println("begin = " + System.currentTimeMillis());
        myThread.run();
        System.out.println("end = " + System.currentTimeMillis());
    }
}
