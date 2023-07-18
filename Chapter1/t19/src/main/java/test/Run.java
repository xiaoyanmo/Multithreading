package test;

import extthread.MyThread1;
import extthread.MyThread2;

/**
 * 规则性，大概率是优先级高的先执行完毕，同时也要考虑随机性
 */
public class Run {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            // 线程的优先级与代码执行顺序无关,出现这
            //种结果是因为MyThread2的优先级是最高的，说明线程
            //的优先级具有一定的规律性，即CPU尽量将执行资源让
            //给优先级比较高的线程
            // 黑色星星
            MyThread1 thread1 = new MyThread1();
            thread1.setPriority(1);
            thread1.start();
            // 白色星星 优先执行完毕
            MyThread2 thread2 = new MyThread2();
            thread2.setPriority(10);
            thread2.start();
        }
    }
}
