package extthread;

import java.util.logging.Logger;

public class MyThread implements Runnable {

    private int i = 5;

    @Override
    public synchronized void run() {
        // println 方法在内部是同步的，但i--的操作却是在进入println()之前发生的，
        // 所以有发生非线程安全问题的概率
        Logger.getGlobal().info("i=" + (i--) + " threadName="
                + Thread.currentThread().getName());
    }

}
