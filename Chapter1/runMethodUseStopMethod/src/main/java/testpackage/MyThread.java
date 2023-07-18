package testpackage;

import java.util.logging.Logger;

public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            this.stop();
        } catch (ThreadDeath e) {
            Logger.getGlobal().info("进入了 MyThread catch()方法！");
            Thread.currentThread().interrupt();
        }
    }
}
