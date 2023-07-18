package test1.service;

import test1.extobject.MyObject;

public class Service {
    /**
     * 当多个线程同时执行synchronized（x）{}同步代码块时呈同步效果
     * @param object
     */
    public void testMethod1(MyObject object) {
        synchronized (object) {
            try {
                System.out.println("testMethod1 ____getLock time = " + System.currentTimeMillis() + " run ThreadName = " + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("testMethod1 ____reaseLock time = " + System.currentTimeMillis() + " run ThreadName = " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
