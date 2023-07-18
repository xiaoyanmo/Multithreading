package run;

import mythread.MyThread;

public class Run2 {
    public static void main(String[] args) {
        MyThread mythread = new MyThread();
        mythread.setName("A");
        mythread.start();
        // 这个是实例方法，可以去掉注释，结果是main线程在调用
        /**
         * 2月 25, 2023 10:05:57 下午 mythread.MyThread <init>
         * 信息: 构造方法的打印 Thread.currentThread().getName：main
         * 2月 25, 2023 10:05:57 下午 mythread.MyThread <init>
         * 信息: 构造方法的打印 Thread.currentThread().getId()：1
         * 2月 25, 2023 10:05:57 下午 mythread.MyThread <init>
         * 信息: 构造方法的打印 this.getName：Thread-0
         * 2月 25, 2023 10:05:57 下午 mythread.MyThread <init>
         * 信息: 构造方法的打印 this.getId：16
         * 2月 25, 2023 10:05:57 下午 mythread.MyThread run
         * 信息: run方法的打印 Thread.currentThread().getName：main
         * 2月 25, 2023 10:05:57 下午 mythread.MyThread run
         * 信息: run方法的打印 Thread.currentThread().getId()：1
         * 2月 25, 2023 10:05:57 下午 mythread.MyThread run
         * 信息: run方法的打印 this.getName：Thread-0
         * 2月 25, 2023 10:05:57 下午 mythread.MyThread run
         * 信息: run方法的打印 this.getId：16
         */
//        mythread.run();
    }
}
