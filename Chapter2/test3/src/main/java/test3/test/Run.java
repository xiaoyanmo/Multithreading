package test3.test;

import test3.extobject.MyObject;
import test3.extthread.ThreadA;
import test3.extthread.ThreadB;
import test3.service.Service;

public class Run {
    /**
     * 当其他线程执行x对象方法
     * 里面的synchronized（this）代码块时呈现同步效果
     * @param args
     */
    public static void main(String[] args) {
        Service service = new Service();
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(service, object);
        a.setName("a");
        a.start();

        ThreadB b = new ThreadB(object);
        b.setName("b");
        b.start();
    }
}
