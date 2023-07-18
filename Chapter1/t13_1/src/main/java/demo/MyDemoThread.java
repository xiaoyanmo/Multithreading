package demo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyDemoThread extends Thread {
    @Override
    public void run() {
        try {
            if (interrupted()) {
                throw new InterruptedException();
            }
        } catch (InterruptedException e) {
            Logger.getGlobal().log(Level.INFO, () -> String.format("%s %s", "利用抛异常!进入catch!", this.isInterrupted()));
            Thread.currentThread().interrupt();
            Logger.getGlobal().log(Level.INFO, () -> String.format("%s %s", "利用抛异常!进入catch!", this.isInterrupted()));
        }
    }
}
