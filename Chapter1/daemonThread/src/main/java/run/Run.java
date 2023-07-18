package run;

import testpackage.MyThread;

import java.util.logging.Logger;

/**
 * 一定要搜索守护线程和非守护线程
 */
public class Run {
    /**
     * 什么是守护线程？守护线程是一种特殊的线程，
     * 当进程中不存在非守护线程了，则守护线程自动销
     * 毁。典型的守护线程是垃圾回收线程，当进程中没有
     * 非守护线程了，则垃圾回收线程也就没有存在的必要
     * 了，自动销毁。
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            /**
             * 主线程main在本章节中属于用户线程，凡是调用
             * setDaemon（true）代码并且传入true值的线程才是守
             * 护线程
             */
            MyThread thread = new MyThread();
            /**
             * 守护必须在start方法之前
             */
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(5000);
            Logger.getGlobal().info("我离开thread对象也不再打印了，也就是停止了！");
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
