package customize;


import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {


    public static void main(String[] args) {
        try {
            Random rand = SecureRandom.getInstanceStrong();

            // 一个自定义线程实例，打印10次线程名称
            MyThread thread = new MyThread();
            thread.setName("customThread");
            thread.start();
            Thread.currentThread().setName("mainThread");
            // 主线程实例打印10次线程名称
            for (int i = 0; i < 10; i++) {
                int time = rand.nextInt(1000);
                Thread.sleep(time);
                Logger.getGlobal().info("main= " + Thread.currentThread().getName());
            }
        } catch (InterruptedException | NoSuchAlgorithmException e) {
            Logger.getGlobal().log(Level.WARNING, "Interrupted!", e);
            Thread.currentThread().interrupt();
        }
    }
}
