package mythread;

import java.util.logging.Logger;

public class MyThread extends Thread {

    private int count = 5;

    public MyThread(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            Logger.getGlobal().info("由 " + this.currentThread().getName()
                    + " 计算，count=" + count);
        }
    }
}
