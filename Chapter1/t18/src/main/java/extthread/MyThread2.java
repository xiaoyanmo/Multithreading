package extthread;

import java.util.logging.Logger;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        Logger.getGlobal().info("MyThread2 run priority=" + this.getPriority());
    }
}
