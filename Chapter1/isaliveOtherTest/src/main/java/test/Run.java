package test;

import mythread.CountOperate;

public class Run {

    public static void main(String[] args) {
        // 自己执行
//        CountOperate c2 = new CountOperate();
//        System.out.println("main begin c2 isAlive=" + c2.isAlive());
//        c2.setName("A");
//        c2.start();
//        System.out.println("main end c2 isAlive=" + c2.isAlive());

        // 构建第二个到第四个线程期间，您将第一个线程作为参数传入并将其保存在实例成员中st。
        CountOperate c = new CountOperate();
        Thread t1 = new Thread(c);
        System.out.println("main begin t1 isAlive=" + t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 isAlive=" + t1.isAlive());
    }

}
