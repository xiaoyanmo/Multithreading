package test;

/**
 * 在上述示例代码中，我们使用了两个不同的对象 lock1 和 lock2 来保证并发访问的安全性。
 * 首先，我们启动了四个线程，其中每两个线程使用不同的对象来增加 count1 和 count2 的值。
 * 这样，我们就可以达到多对象多锁的效果，可以有效避免并发的问题。
 * 最后，我们让主线程等待所有线程完成之后，
 * 输出 count1 和 count2 的值。
 *
 * 在实际的多线程编程中，使用多对象多锁可以有效提高程序的并发性能和安全性。
 */
public class MultiObjectLockExample {

    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    private static int count1 = 0;
    private static int count2 = 0;

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (lock1) {
                    count1++;
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (lock2) {
                    count2++;
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (lock1) {
                    count1++;
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (lock2) {
                    count2++;
                }
            }
        }).start();

        // Wait for all threads to finish
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count 1: " + count1);
        System.out.println("Count 2: " + count2);
    }
}
