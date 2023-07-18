package test;

import extthread.ThreadA;
import tools.Tools;

public class Test {
    public static void main(String[] args) throws
            InterruptedException {
        if (Tools.tl.get() == null) {
            Tools.tl.set("此值是main线程放入的！");
        }
        System.out.println("\t\t在Main线程中取值=" +
                Tools.tl.get());
        Thread.sleep(100);
        ThreadA a = new ThreadA();
        a.start();
        Thread.sleep(5000);
        Tools.tl.set("此值是main线程newnewnewnewnew放入的！");
    }
}