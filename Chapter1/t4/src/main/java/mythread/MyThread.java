package mythread;

import java.util.logging.Logger;

public class MyThread extends Thread {

    private int count = 5;

//	@Override
//	public void run() {
//		super.run();
//		count--;
//		Logger.getGlobal().info("由 "+this.currentThread().getName()+" 计算，count="+count);
//	}

    /**
     * 在某些JVM中，i--的操作要分成如下2步:
     * 1.取得原有i值
     * 2.计算i-1
     * 3.对i进行赋值
     * 在这3个步骤中，如果有多个线程同时访问，那么一定会出现非线程安全问题。
     */
    @Override
    synchronized public void run() {
        super.run();
        count--;
        Logger.getGlobal().info("由 " + this.currentThread().getName() + " 计算，count=" + count);
    }
}
