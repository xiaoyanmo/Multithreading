package service;

/**
 * 出现这种情况是因为String的两个值都是"AA"，
 * 两个线程持有相同的锁，造成B线程不能执行。这就是
 * String常量池所带来的问题，所以大多数情况下，同
 * 步synchronized代码块不使用String作为锁对象，而
 * 改用其他，例如，new Object()实例化一个新的
 * Object对象，它并不放入缓存池中，或者执行new
 * String()创建不同的字符串对象，形成不同的锁
 */
public class Service {
    public static void print(String stringParam) {
        try {
            synchronized (stringParam) {
                while (true) {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
