package customize;


import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread extends Thread {
    private Random rand;

    public MyThread() throws NoSuchAlgorithmException {
        this.rand = SecureRandom.getInstanceStrong();
    }

    @Override
    public void run() {
        try {
            // 输出10个MyThread，
            for (int i = 0; i < 10; i++) {
                int time = this.rand.nextInt(1000);
                Thread.sleep(time);
                Logger.getGlobal().info("run= " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            Logger.getGlobal().log(Level.WARNING, "Interrupted!", e);
            Thread.currentThread().interrupt();
        }
    }
}
