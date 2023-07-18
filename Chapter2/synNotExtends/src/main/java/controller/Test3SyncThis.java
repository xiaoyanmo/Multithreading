package controller;

public class Test3SyncThis {
    // monitorenter 和 monitorexit
    public void testSyncThis() {
        synchronized (this) {
            if (Thread.holdsLock(this)) {
                System.out.println("当前线程持有obj对象的锁");
            } else {
                System.out.println("当前线程没有持有obj对象的锁");
            }
        }
    }

    public static void main(String[] args) {
        Test3SyncThis test3SyncThis = new Test3SyncThis();
        test3SyncThis.testSyncThis();
    }
}
