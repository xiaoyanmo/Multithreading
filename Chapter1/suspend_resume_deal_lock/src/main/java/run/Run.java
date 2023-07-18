package run;

import testpackage.SynchronizedObject;

public class Run {
// 两个实例线程争抢一把锁，且其中一个手拿锁不放
    public static void main(String[] args) {
        try {
            final SynchronizedObject object = new SynchronizedObject();
            Thread thread1 = new Thread(object::printString);
            thread1.setName("a");
            thread1.start();
            Thread.sleep(1000);
            Thread thread2 = new Thread(() -> {
                System.out.println("thread2启动了，但进入不了printString()方法！只打印1个begin");
                System.out.println("因为printString()方法被a线程锁定并且永远的suspend暂停了！");
                object.printString();
            });
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

}
