package exthread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            Logger.getGlobal().info("run begin");
//            Logger.getGlobal().log(Level.INFO,()->String.format("%s %s","当前 MyThread 线程 sleep前 是否已停止: ", Thread.interrupted()));
            Thread.sleep(200000);
//            Logger.getGlobal().log(Level.INFO,()->String.format("%s %s","当前 MyThread 线程 sleep前 是否已停止: ", Thread.interrupted()));
            Logger.getGlobal().info("run end");
        } catch (InterruptedException e) {
            Logger.getGlobal().log(Level.INFO, () -> String.format("%s %s", "在沉睡中被停止!进入catch!", this.isInterrupted()));
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }
}
