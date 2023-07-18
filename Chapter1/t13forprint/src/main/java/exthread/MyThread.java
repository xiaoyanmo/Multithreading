package exthread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            if (Thread.interrupted()) {
                Logger.getGlobal().info("已经是停止状态了!我要退出了!");
                break;
            }
            int finalI = i;
            Logger.getGlobal().log(Level.INFO, () -> String.format("%s %d", "i=", (finalI + 1)));

        }
        Logger.getGlobal().info("我被输出，如果此代码是for又继续运行，线程并未停止！");
    }
}
