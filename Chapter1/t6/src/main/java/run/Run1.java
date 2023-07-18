package run;

import java.util.logging.Logger;

public class Run1 {
    public static void main(String[] args) {
        Logger.getGlobal().info(Thread.currentThread().getName());
    }
}
