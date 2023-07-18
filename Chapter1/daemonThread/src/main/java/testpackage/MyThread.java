package testpackage;

import java.util.logging.Logger;

public class MyThread extends Thread {
    private int i = 0;

    @Override
    public void run() {
        try {
            while (true) {
                i++;
                Logger.getGlobal().info("i=" + (i));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
    }
}
