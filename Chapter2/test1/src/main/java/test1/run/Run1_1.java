package test1.run;

import test1.extobject.MyObject;
import test1.extthread.ThreadA;
import test1.extthread.ThreadB;
import test1.service.Service;

public class Run1_1 {
    public static void main(String[] args) {
        Service service = new Service();
        /**
         * 同步调用因为是相同的锁
         */
        MyObject myObject = new MyObject();
        ThreadA a = new ThreadA(service, myObject);
        a.setName("a");
        a.start();

        ThreadB b = new ThreadB(service, myObject);
        b.setName("b");
        b.start();
    }
}
