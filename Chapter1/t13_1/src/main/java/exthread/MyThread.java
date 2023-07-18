package exthread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread extends Thread {
    /**
     * 异常停止法
     */
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                if (interrupted()) {
                    Logger.getGlobal().info("已经是停止状态了!我要退出了!");
                    throw new InterruptedException();
                }
                int finalI = i;
                Logger.getGlobal().log(Level.INFO, () -> String.format("%s %d", "i=", (finalI + 1)));
            }
            Logger.getGlobal().info("我在for下面");
        } catch (InterruptedException e) {
            Logger.getGlobal().log(Level.INFO, "进MyThread.java类run方法中的catch了！", e.getMessage());
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }
}
