package mythread;

import java.time.LocalTime;

/**
 * isaliveOtherTest
 */
public class CountOperate extends Thread {

    /**
     * Logger.getGlobal().info("this.getName()=" + this.getName());
     */
    public CountOperate() {
        Thread currentThread = Thread.currentThread();
        System.err.println(LocalTime.now() + "\t" + "CountOperate---begin");
        System.err.println(LocalTime.now() + "\t" + "Thread.currentThread().getName()= " + currentThread.getName());
        System.err.println(LocalTime.now() + "\t" + "this.getName()= " + this.getName());
        System.err.println(LocalTime.now() + "\t" + "super.getName()= " + super.getName());
        System.err.println(LocalTime.now() + "\t" + "CountOperate---end");
        System.err.println(LocalTime.now() + "\t" + "main id: " + currentThread.getId());
        System.err.println();
    }

    /**
     * Logger.getGlobal().info("this.getName()=" + this.getName());
     */
    @Override
    public void run() {
        System.out.println();
//        this.setName("A");
        Thread currentThread = Thread.currentThread();
        System.out.println(LocalTime.now() + "\t" + "run---begin");
        System.out.println(LocalTime.now() + "\t" + "Thread.currentThread().getName()= " + currentThread.getName());
        System.out.println(LocalTime.now() + "\t" + "this.getName()= " + this.getName());
        System.out.println(LocalTime.now() + "\t" + "super.getName()= " + super.getName());
        System.out.println(LocalTime.now() + "\t" + "run---end");
        System.out.println(LocalTime.now() + "\t" + "run id: " + currentThread.getId());

    }

}
