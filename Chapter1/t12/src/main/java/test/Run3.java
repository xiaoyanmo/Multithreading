package test;

import exthread.MyThread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 1）this.interrupted()：测试当前线程是否已经
 * 是中断状态，执行后具有清除状态标志值为false的功
 * 能。
 * 2）this.isInterrupted()：测试线程Thread对象
 * 是否已经是中断状态，不清除状态标志。
 */
public class Run3 {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            // 还是实例调用的是Thread的静态方法，测试的是该thread实例线程是否停止；故得到两个true
            Logger.getGlobal().log(Level.INFO, () -> String.format("%s %s", "是否停止1？=", thread.isInterrupted()));
            Logger.getGlobal().log(Level.INFO, () -> String.format("%s %s", "是否停止2？=", thread.isInterrupted()));
        } catch (InterruptedException e) {
            Logger.getGlobal().log(Level.INFO, "main catch", e);
            Thread.currentThread().interrupt();
        }
        Logger.getGlobal().info("end!");
    }
}

