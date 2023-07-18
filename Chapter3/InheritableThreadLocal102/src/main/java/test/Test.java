package test;


import exthread.ThreadA;
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
        Thread.sleep(3000);
        for (int i = 0; i < 10; i++) {
            System.out.println("main end get value=" +
                    Tools.tl.get());
            Thread.sleep(1000);
        }
    }
}