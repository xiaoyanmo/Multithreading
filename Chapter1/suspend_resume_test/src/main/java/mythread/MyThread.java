package mythread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread extends Thread {

    private long i = 0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        try {

            while (true) {
                i++;
                if (this.isInterrupted()) {
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            Logger.getGlobal().log(Level.INFO, "MyThread catch!", e);
            Thread.currentThread().interrupt();
        }
    }

}
