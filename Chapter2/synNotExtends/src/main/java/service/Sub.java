package service;

/**
 * 子类方法不同步
 */
public class Sub extends Main {

    @Override
    // 第二步，两个线程依次排队进入
//	synchronized

    public void serviceMethod() {
        // 第一步，两个线程异步到这块
        try {
            System.out.println("int sub 下一步sleep begin threadName="
                    + Thread.currentThread().getName() + " time="
                    + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int sub 下一步sleep   end threadName="
                    + Thread.currentThread().getName() + " time="
                    + System.currentTimeMillis());
            // 第一步，两个线程其中一个先持有锁，两个线程排队进入
            super.serviceMethod();
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

}
