package mythread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        try {
            Logger.getGlobal().info("run threadName=" + Thread.currentThread().getName() + " begin");
            Thread.sleep(2000);
            Logger.getGlobal().info("run threadName=" + this.getName() + " end");
        } catch (InterruptedException e) {
            Logger.getGlobal().log(Level.WARNING, "Interrupted!", e);
            // Restore interrupted state
            Thread.currentThread().interrupt();
        }
    }
}
