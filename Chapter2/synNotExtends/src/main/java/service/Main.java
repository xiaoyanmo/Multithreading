package service;

/**
 * 父类方法同步
 */
public class Main {

    synchronized public void serviceMethod() {
        try {
            System.out.println("int main 下一步sleep begin threadName="
                    + Thread.currentThread().getName() + " time="
                    + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int main 下一步sleep   end threadName="
                    + Thread.currentThread().getName() + " time="
                    + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
