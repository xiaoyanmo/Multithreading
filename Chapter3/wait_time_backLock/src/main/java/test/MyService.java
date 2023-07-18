package test;

public class MyService {

    public void testMethod() {
        try {
            synchronized (this) {
                System.out.println("wait begin " +
                        Thread.currentThread().getName() + " "
                        + System.currentTimeMillis());
                wait(5000);
                System.out.println("wait   end " +
                        Thread.currentThread().getName() + " "
                        + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void longTimeSyn() {
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}