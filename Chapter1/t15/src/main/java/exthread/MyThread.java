package exthread;

import java.util.logging.Logger;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 100000; i++) {
                Logger.getGlobal().info("i=" + (i + 1));
            }
            Logger.getGlobal().info("run begin");
            Thread.sleep(200000);
            Logger.getGlobal().info("run end");
        } catch (InterruptedException e) {
            Logger.getGlobal().info("先停止，再遇到了sleep!进入catch!");
            e.printStackTrace();
        }
    }
}
