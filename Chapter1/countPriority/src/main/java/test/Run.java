package test;

import extthread.ThreadA;
import extthread.ThreadB;

import java.util.logging.Logger;

public class Run {
    // 优先级高的运行得快
    public static void main(String[] args) {

        try {
            // 优先级低
            ThreadA a = new ThreadA();
            a.setPriority(Thread.NORM_PRIORITY - 3);
            a.start();
            // 优先级高
            ThreadB b = new ThreadB();
            b.setPriority(Thread.NORM_PRIORITY + 3);
            b.start();

            // 不一定，线程的执行时间也是随机的
//            Thread.sleep(200);
            Thread.sleep(2000);
            a.stop();
            b.stop();

            Logger.getGlobal().info("a=" + a.getCount());
            Logger.getGlobal().info("b=" + b.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
