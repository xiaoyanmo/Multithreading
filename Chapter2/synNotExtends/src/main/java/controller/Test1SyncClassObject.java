package controller;

public class Test1SyncClassObject {
    public static void main(String[] args) {
        System.out.println("A " +
                Thread.currentThread().holdsLock(Test1SyncClassObject.class));
        // 将类对象当做锁
        synchronized (Test1SyncClassObject.class) {
            System.out.println("B " +
                    Thread.currentThread().holdsLock(Test1SyncClassObject.class));
        }
        System.out.println("C " +
                Thread.currentThread().holdsLock(Test1SyncClassObject.class));
    }
}
