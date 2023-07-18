package controller;

import extthread.MyThreadA;
import extthread.MyThreadB;
import service.Sub;

/**
 * 同步方法不能继承，得需要手动添加synchronized到子类所覆盖的方法上面
 */
public class Test {
    /**
     * synchronized方法是将当前对象作为锁，而
     * synchronized代码块是将任意对象作为锁。可以将锁
     * 看成一个标识，哪个线程持有这个标识，就可以执行
     * 同步方法。
     *
     * @param args
     */
    public static void main(String[] args) {
        Sub subRef = new Sub();

        MyThreadA a = new MyThreadA(subRef);
        a.setName("A");
        a.start();

        MyThreadB b = new MyThreadB(subRef);
        b.setName("B");
        b.start();
    }

}
