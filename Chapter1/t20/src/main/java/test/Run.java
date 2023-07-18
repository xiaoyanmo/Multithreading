package test;

import extthread.MyThread1;
import extthread.MyThread2;

/**
 * 优先级的随机性
 * 前面案例介绍了线程具有优先级，优先级高的线
 * 程往往优先执行完，但这个结果不是绝对的，因为线
 * 程的优先级还具有“随机性”，即优先级较高的线程
 * 不一定每一次都先执行完
 * 当优先级接近时，随机性就体现出来了
 */
public class Run {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            // 黑色星星
            MyThread1 thread1 = new MyThread1();
            thread1.setPriority(5);
            thread1.start();
            // 黑色星星
            MyThread2 thread2 = new MyThread2();
            thread2.setPriority(6);
            thread2.start();
        }
    }
}
