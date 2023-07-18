package extthread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread extends Thread {

    @Override
    public void run() {
        while (true) {
            if (this.isInterrupted()) {
                Logger.getGlobal().info("停止了!");
                Thread.currentThread().interrupt();
                return;
            }
            Logger.getGlobal().log(Level.INFO, () -> String.format("%s %d", "timer=", System.currentTimeMillis()));
        }
    }

}
