package test;

import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) {
        Thread runThread = Thread.currentThread();
        Logger.getGlobal().info(runThread.getName() + " " + runThread.getId());
    }
}
