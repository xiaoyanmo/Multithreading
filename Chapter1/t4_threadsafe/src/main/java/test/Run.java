package test;

import extthread.ALogin;
import extthread.BLogin;

public class Run {
    /**
     * 多个线程对同一个对象中
     * 的同一个实例变量进行操作时会出现值被更改、值不
     * 同步的情况，进而影响程序执行流程
     * @param args
     */
    public static void main(String[] args) {
        ALogin a = new ALogin();
        a.start();
        BLogin b = new BLogin();
        b.start();
    }

}
