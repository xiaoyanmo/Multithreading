package test3.extobject;

public class MyObject {
    /**
     * 当其他线程执行x对象方法里面的synchronized（this）代码块时呈现同步效果
     */
    public void speedPrintString() {
        synchronized (this) {
            System.out.println("speedPrintString ____getLock time = " + System.currentTimeMillis() + " run ThreadName = " + Thread.currentThread().getName());
            System.out.println("----------");
            System.out.println("speedPrintString ____releaseLock time = " + System.currentTimeMillis() + " run ThreadName = " + Thread.currentThread().getName());
        }
    }
}
