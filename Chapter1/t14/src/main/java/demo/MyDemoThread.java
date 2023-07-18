package demo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyDemoThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Logger.getGlobal().log(Level.INFO, () -> String.format("%s %s", "在沉睡中被停止!进入catch!", this.isInterrupted()));
            Thread.currentThread().interrupt();
            Logger.getGlobal().log(Level.INFO, () -> String.format("%s %s", "在沉睡中被停止!进入catch!", this.isInterrupted()));
        }
    }
}
