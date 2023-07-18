package test;

import com.mythread.www.MyThread;

import java.util.logging.Logger;

public class Run {

    public static void main(String[] args) {
        // 一个自定义线程实例
        MyThread mythread = new MyThread();
        mythread.start();
        // 主线程实例
        Logger.getGlobal().info("运行结束！\t"+Thread.currentThread().getName());
    }

}
