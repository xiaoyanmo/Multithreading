package test;

import myobject.MyObject;

public class Run {
    // 两个线程共享一个实例对象，且方法未加锁，异步执行
    public static void main(String[] args) throws InterruptedException {

        final MyObject myobject = new MyObject();

        Thread thread1 = new Thread(() -> myobject.setValue("a", "aa"));
        thread1.setName("a");
        thread1.start();

        Thread.sleep(500);

        Thread thread2 = new Thread(myobject::printUsernamePassword);
        thread2.start();

    }

}
