package mytask;

public class Task {

    public void doLongTimeTask() {
        // 线程A和线程B，各自异步输出100，交叉输出
        for (int i = 0; i < 100; i++) {
            System.out.println("nosynchronized threadName=" + Thread.currentThread().getName() + " i=" + (i + 1));
        }
        System.out.println();
        // 线程A和线程B，各自同步输出100，排队输出
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                System.err.println("synchronized threadName=" + Thread.currentThread().getName() + " i=" + (i + 1));
            }
        }

    }
}
