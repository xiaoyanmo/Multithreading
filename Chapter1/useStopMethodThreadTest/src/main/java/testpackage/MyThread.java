package testpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread extends Thread {
    private int i = 0;

    @Override
    public void run() {
        try {
            while (true) {
                i++;
                Logger.getGlobal().log(Level.INFO, () -> String.format("%s %d", "i= ", i));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Logger.getGlobal().log(Level.INFO, "MyThread catch", e);
            Thread.currentThread().interrupt();
        }
    }

}
