package test;

import mythread.CountOperate;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        // 三个实例对象，this打印的是创建实例时的线程对象的名称
        // 而this则表示的是当前哪个对象调用的这方法，此时这个线程才刚刚构造还没名字，会给个名字，所以输出结果为Thread-0
        /**
         * 不同之处getName()在于实例方法，这意味着它对类的实例进行操作Thread。
         *
         * Thread.getCurrentThread()是一个类或静态方法，这意味着它不对实例进行操作Thread，而是对其类进行操作。
         *
         * 最终的区别在于：如果调用Thread.currentThread().getName(),currentThread()将返回 的实例Thread，
         * 然后您可以调用getName()该实例。您不能调用，Thread.getName()因为getName()必须在 的实例上调用Thread
         *
         * Thread.currentThread().getName(...)方法指的是当前线程的名称，而getName(...)指的是 Thread 类的任何实例的名称
         *
         * 原因：
         * 因为Thread.currentThread().getName()获取当前运行线程的名称，但getName()解析为st.getName(), 并且st始终是您的第一个线程实例。
         *
         * 为什么getName()决心st.getName()？因为：
         *
         * 在构建第二个到第四个线程期间，您将第一个线程作为参数传入并将其保存在实例成员中st。
         *
         * run你的线程调用的方法，st.show()所以他们总是show在第一个线程上调用。（如果你启动了第一个线程，你会在那里得到一个 NPE，因为第一个线程的st成员永远不会被赋予非null值。）
         *
         * show因此，在 之内this是st（第一个线程）。非限定实例方法调用用作this它们的实例，并且this是第一个线程。
         */
        CountOperate c = new CountOperate();
        Thread t1 = new Thread(c);
        t1.setName("A");
        t1.start();

        CountOperate c2 = new CountOperate();
        Thread t2 = new Thread(c2);
        t2.setName("B");
        t2.start();

        CountOperate c3 = new CountOperate();
        Thread t3 = new Thread(c3);
        t3.setName("C");
        t3.start();

        System.out.println("Main " + Thread.currentThread().getName());
    }

}
