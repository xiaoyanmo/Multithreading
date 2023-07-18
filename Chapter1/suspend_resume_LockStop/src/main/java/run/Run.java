package run;

import mythread.MyThread;

import java.util.logging.Logger;

public class Run {
// 主线程和实例线程争抢同一把锁
    public static void main(String[] args) {
// 出现这种情况的原因是当程序运行到
//System.out.println（i）方法内部停止时，同步锁是
//不释放的，println()方法源代码
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.suspend();
            System.out.println("main end!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
