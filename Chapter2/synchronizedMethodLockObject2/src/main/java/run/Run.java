package run;

import extobject.MyObject;
import extthread.ThreadA;
import extthread.ThreadB;

public class Run {

    public static void main(String[] args) {
        MyObject object = new MyObject();
        // 两个线程分别调用业务对象的两个不同的方法，线程A调用同步方法A，线程B调用非同步方法B
        ThreadA a = new ThreadA(object);
        a.setName("A");
        ThreadB b = new ThreadB(object);
        b.setName("B");

        a.start();
        b.start();
    }

}
