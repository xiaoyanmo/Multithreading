package exthread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread extends Thread {
    /**
     * 循环break法
     */
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            Logger.getGlobal().log(Level.INFO, () -> String.format("当前线程是否已经停止: %s", this.isInterrupted()));
            if (interrupted()) {
                Logger.getGlobal().info("已经是停止状态了!我要退出了!");
                break;
            }
            int finalI = i;
            Logger.getGlobal().log(Level.INFO, () -> String.format("%s %d", "i=", (finalI + 1)));
        }
    }
}
