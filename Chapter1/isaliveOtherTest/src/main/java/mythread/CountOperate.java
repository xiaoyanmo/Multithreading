package mythread;

import java.util.logging.Logger;

/**
 * currentThreadExt
 */
public class CountOperate extends Thread {

    public CountOperate() {

        System.err.println("CountOperate---begin");

        System.err.println("Thread.currentThread().getName()="
                + Thread.currentThread().getName());
        System.err.println("Thread.currentThread().isAlive()="
                + Thread.currentThread().isAlive());

        System.err.println("this.getName()=" + this.getName());
        System.err.println("this.isAlive()=" + this.isAlive());

        System.err.println("CountOperate---end");
        System.out.println();
    }

    @Override
    public void run() {
        System.out.println("run---begin");

        System.out.println("Thread.currentThread().getName()="
                + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()="
                + Thread.currentThread().isAlive());

        System.out.println("this.getName()=" + this.getName());
        System.out.println("this.isAlive()=" + this.isAlive());

        System.out.println("run---end");
    }

}
