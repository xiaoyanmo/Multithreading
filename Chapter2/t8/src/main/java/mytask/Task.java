package mytask;

/**
 * 和synchronized方法一样，
 * synchronized（this）代码块也是锁定当前对象的
 */
public class Task {
    /**
     * 线程A和线程B到这里之后，
     * 谁先抢得这个对象锁就先调用对应的方法，
     * 线程A和线程B是排队输出的
     */
    // 不加synchronized，就是异步输出，加上就是线程排队输出
    // synchronized
    public void otherMethod() {
        System.out.println("------------------------run--otherMethod");
    }

    public void doLongTimeTask() {
        synchronized (this) {
            for (int i = 0; i < 10000; i++) {
                System.out.println("synchronized threadName="
                        + Thread.currentThread().getName() + " i=" + (i + 1));
            }
        }

    }
}
