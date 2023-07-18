package test;

import extthread.ThreadA;
import extthread.ThreadB;
import service.HasSelfPrivateNum;

/**
 * 两个线程操作同一个对象
 */
public class Run {

    public static void main(String[] args) {

        HasSelfPrivateNum numRef = new HasSelfPrivateNum();

        ThreadA athread = new ThreadA(numRef);
        athread.start();

        ThreadB bthread = new ThreadB(numRef);
        bthread.start();

    }

}
