package mythread;

import java.util.logging.Logger;

public class MyThread extends Thread {
    @Override
    public void run() {
        Logger.getGlobal().info("run=" + this.isAlive());
    }
}
