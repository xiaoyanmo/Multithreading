package mythread;

import java.util.logging.Logger;

public class MyThread extends Thread {
    private long i = 0;

    @Override
    public void run() {
        // println 主线程和实例线程在争抢这把锁
        // 锁不释放
        while (true) {
            i++;
            System.out.println(i);
        }
    }
}
