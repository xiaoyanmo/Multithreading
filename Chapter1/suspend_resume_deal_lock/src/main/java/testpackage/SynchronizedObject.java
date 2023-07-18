package testpackage;

import java.util.logging.Logger;

public class SynchronizedObject {

    synchronized public void printString() {
        // 造成公共同步对象被独占
        Logger.getGlobal().info("begin");
        if (Thread.currentThread().getName().equals("a")) {
            Logger.getGlobal().info("a线程永远 suspend了！");
            Thread.currentThread().suspend();
        }
        Logger.getGlobal().info("end");
    }

}
