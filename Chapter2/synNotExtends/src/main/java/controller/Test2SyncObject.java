package controller;

public class Test2SyncObject {
    public static void main(String[] args) {
        // monitorenter 和 monitorexit
        Object obj = new Object();
        synchronized (obj) {
            if (Thread.holdsLock(obj)) {
                System.out.println("当前线程持有obj对象的锁");
            } else {
                System.out.println("当前线程没有持有obj对象的锁");
            }
        }
    }
}