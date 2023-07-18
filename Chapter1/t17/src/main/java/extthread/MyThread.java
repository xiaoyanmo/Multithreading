package extthread;

import java.util.logging.Logger;

public class MyThread extends Thread {

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 50000000; i++) {
            // yield()方法的作用是放弃当前的CPU资源，让其
            //他任务去占用CPU执行时间，放弃的时间不确定，有可
            //能刚刚放弃，马上又获得CPU时间片
			Thread.yield();
            count = count + (i + 1);
        }
        long endTime = System.currentTimeMillis();
        Logger.getGlobal().info("用时：" + (endTime - beginTime) + "毫秒！");
    }

}
