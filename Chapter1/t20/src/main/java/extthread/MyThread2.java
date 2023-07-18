package extthread;

import java.util.Random;
import java.util.logging.Logger;

/**
 * 根据此案例可以得出一个结论，优先级较高的线
 * 程并不一定每一次都先执行完run()方法中的任务，也
 * 就是线程优先级与输出顺序无关，这两者并没有依赖
 * 关系，它们具有不确定性、随机性
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            random.nextInt();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("☆☆☆☆☆thread 2 use time=" + (endTime - beginTime));
    }
}
