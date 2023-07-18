package mythread;

/**
 * 因为Thread.currentThread().getName()获取当前运行线程的名称，但getName()解析为st.getName(), 并且st始终是您的第一个线程实例。
 * <p>
 * 为什么getName()决心st.getName()？因为：
 * <p>
 * 在构建第二个到第四个线程期间，您将第一个线程作为参数传入并将其保存在实例成员中st。
 * <p>
 * run你的线程调用的方法，st.show()所以他们总是show在第一个线程上调用。（如果你启动了第一个线程，你会在那里得到一个 NPE，因为第一个线程的st成员永远不会被赋予非null值。）
 * <p>
 * show因此，在 之内this是st（第一个线程）。非限定实例方法调用用作this它们的实例，并且this是第一个线程。
 */
public class SynchThread1 extends Thread {
    SynchThread1 st;

    SynchThread1() {
    }

    SynchThread1(SynchThread1 s) {
        st = s;
    }

    public void run() {
        st.show();
    }

    synchronized void show() {
        for (int i = 0; i < 5; i++) {
//            System.out.print(Thread.currentThread().getName() + " "); //replace here
            System.out.print(this.getName() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SynchThread1 s1 = new SynchThread1();
        Thread t1 = new SynchThread1(s1);
        Thread t2 = new SynchThread1(s1);
        Thread t3 = new SynchThread1(s1);
        s1.setName("t0");
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();
    }
}