package myservice;

public class MyService {
    private String lock = "123";

    public void testMethod() {
        try {
            System.out.println(Thread.currentThread().getName() + "\t" + Thread.holdsLock(lock) + "\t" + lock);
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + "\t" + Thread.holdsLock(lock) + "\t" + lock);
                System.out.println(Thread.currentThread().getName() + " begin "
                        + System.currentTimeMillis());
                lock = "456";
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + "   end "
                        + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
