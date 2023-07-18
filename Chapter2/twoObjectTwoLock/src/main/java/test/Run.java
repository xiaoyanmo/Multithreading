package test;

import extthread.ThreadA;
import extthread.ThreadB;
import service.HasSelfPrivateNum;

public class Run {
    /**
     * 两个线程操作两个业务对象，分别持有各自的锁，线程和业务对象属于一对一的关系
     * @param args
     */
    public static void main(String[] args) {
        // 实例业务对象一
        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        // 实例业务对象二
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();

        ThreadA athread = new ThreadA(numRef1);
        athread.start();

        ThreadB bthread = new ThreadB(numRef2);
        bthread.start();

    }

}
