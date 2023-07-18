package test;

import exthread.MyThread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Run {

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            Logger.getGlobal().log(Level.INFO, "main catch", e);
            Thread.currentThread().interrupt();
        }
        Logger.getGlobal().info("end!");
    }

}
