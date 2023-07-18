package test;

import exthread.MyThread;

import java.util.logging.Logger;

public class Run {
    public static void main(String[] args) {
        // 当前线程不能停止，还能再休眠
        MyThread thread = new MyThread();
        thread.start();
        thread.interrupt();
        Logger.getGlobal().info("end!");
    }
}
