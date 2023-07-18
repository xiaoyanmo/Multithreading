package test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Run2 {
    public static void main(String[] args) {
        // 此时当前线程指的是main线程，故第一次是true，第二次是false
        Thread.currentThread().interrupt();
        Logger.getGlobal().log(Level.INFO, () -> String.format("%s %s", "是否停止1？=", Thread.interrupted()));
        Logger.getGlobal().log(Level.INFO, () -> String.format("%s %s", "是否停止2？=", Thread.interrupted()));
        Logger.getGlobal().info("end!");
    }
}
