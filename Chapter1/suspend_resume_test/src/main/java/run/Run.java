package run;

import mythread.MyThread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Run {

    public static void main(String[] args) {

        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(5000);
            // A 暂停
            thread.suspend();
            Logger.getGlobal().log(Level.INFO, () -> String.format("A= %d i= %d", System.currentTimeMillis(), thread.getI()));
            Thread.sleep(5000);
            Logger.getGlobal().log(Level.INFO, () -> String.format("A= %d i= %d", System.currentTimeMillis(), thread.getI()));
            // B 恢复
            thread.resume();
            Thread.sleep(5000);

            // C 暂停
            thread.suspend();
            Logger.getGlobal().log(Level.INFO, () -> String.format("B= %d i= %d", System.currentTimeMillis(), thread.getI()));
            Thread.sleep(5000);
            Logger.getGlobal().log(Level.INFO, () -> String.format("B= %d i= %d", System.currentTimeMillis(), thread.getI()));

            // jake测试出来独占
            thread.interrupt();

        } catch (InterruptedException e) {
            Logger.getGlobal().log(Level.INFO, "main catch!", e);
            Thread.currentThread().interrupt();
        }
    }

}
