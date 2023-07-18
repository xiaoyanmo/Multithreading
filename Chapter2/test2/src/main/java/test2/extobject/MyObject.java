package test2.extobject;

public class MyObject {
    /**
     * 当其他线程执行x对象中synchronized同步方法时呈同步效果
     */
    synchronized public void speedPrintString() {
        System.out.println("speedPrintString ____getLock time = " + System.currentTimeMillis() + " run ThreadName = " + Thread.currentThread().getName());
        System.out.println("----------");
        System.out.println("speedPrintString ____releaseLock time = " + System.currentTimeMillis() + " run ThreadName = " + Thread.currentThread().getName());

    }
}
