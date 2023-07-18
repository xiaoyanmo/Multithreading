package test;

import extthread.ThreadA;
import extthread.ThreadB;
import service.Service;

public class Run {

    public static void main(String[] args) {
        try {
            Service service = new Service();

            ThreadA a = new ThreadA(service);
            a.start();

            Thread.sleep(1000);

            ThreadB b = new ThreadB(service);
            b.start();

            System.out.println("已经发起停止的命令了！");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

}
