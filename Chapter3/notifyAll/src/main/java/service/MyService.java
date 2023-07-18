package service;

public class MyService {

    private Object lock = new Object();

    public void waitMethod() {
        try {
            synchronized (lock) {
                System.out.println("begin wait " +
                        System.currentTimeMillis() + " " +
                        Thread.currentThread().getName());
                lock.wait();
                System.out.println(" end wait " +
                        System.currentTimeMillis() + " " +
                        Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void notifyAllMethod() {
        synchronized (lock) {
            System.out.println("begin notify " +
                    System.currentTimeMillis() + " " +
                    Thread.currentThread().getName());
            lock.notifyAll();
            System.out.println(" end notify " + System.currentTimeMillis() + " " +
                    Thread.currentThread().getName());
        }
    }

}
