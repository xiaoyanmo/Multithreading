package mythread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                Logger.getGlobal().info("run=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            Logger.getGlobal().log(Level.INFO, "MyThread catch", e);
            Thread.currentThread().interrupt();
        }
    }
}
