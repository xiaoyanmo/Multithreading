package mythread;

import java.util.logging.Logger;

public class MyThread extends Thread {

    public MyThread() {
        Logger.getGlobal().info("构造方法的打印 Thread.currentThread().getName：" + Thread.currentThread().getName());
        Logger.getGlobal().info("构造方法的打印 Thread.currentThread().getId()：" + Thread.currentThread().getId());
        Logger.getGlobal().info("构造方法的打印 this.getName：" + this.getName());
        Logger.getGlobal().info("构造方法的打印 this.getId：" + this.getId());
        Logger.getGlobal().info("\t\n");
    }

    @Override
    public void run() {
        Logger.getGlobal().info("run方法的打印 Thread.currentThread().getName：" + Thread.currentThread().getName());
        Logger.getGlobal().info("run方法的打印 Thread.currentThread().getId()：" + Thread.currentThread().getId());
        Logger.getGlobal().info("run方法的打印 this.getName：" + this.getName());
        Logger.getGlobal().info("run方法的打印 this.getId：" + this.getId());
    }

}
