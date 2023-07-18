package run;

import mythread.MyThread;

import java.util.logging.Logger;

public class Run {
    /**
     * 判断线程是否存活
     *
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        MyThread mythread = new MyThread();
        Logger.getGlobal().info("begin ==" + mythread.isAlive());
        mythread.start();
        /**
         * 输出的结果为false，因为mythread对象已经在1s之内执行完毕。
         * 需要注意的是，main主线程执行
         * Thread.sleep（1000）方法会使main主线程停止1s，
         * 而不是将mythread线程停止1s。
         */
//        Thread.sleep(1000);
        Logger.getGlobal().info("end ==" + mythread.isAlive());
    }
}
