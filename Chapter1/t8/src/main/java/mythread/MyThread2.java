package mythread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        try {
            Logger.getGlobal().log(Level.INFO, () -> String.format("run threadName= %s,  begin = %d", Thread.currentThread().getName(), System.currentTimeMillis()));
            Thread.sleep(2000);
            Logger.getGlobal().log(Level.INFO, () -> String.format("run threadName= %s,  end   = %d", this.getName(), System.currentTimeMillis()));
        } catch (InterruptedException e) {
            Logger.getGlobal().log(Level.WARNING, "Interrupted!", e);
            // Restore interrupted state
            Thread.currentThread().interrupt();
        }
    }
}
