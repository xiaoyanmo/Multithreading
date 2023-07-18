package extthread;

import java.util.logging.Logger;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        Logger.getGlobal().info("MyThread1 run priority=" + this.getPriority());
        MyThread2 thread2 = new MyThread2();
        thread2.start();
    }
}
