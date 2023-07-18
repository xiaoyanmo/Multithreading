package test;

import myrunnable.MyRunnable;

import java.util.logging.Logger;

public class Run {

    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        // 一个自定义线程实例
        Thread thread = new Thread(runnable);
        thread.start();
        // main方法主线程实例
        Logger.getGlobal().info("运行结束!");
    }

}
