package test;

/**
 * Java线程死锁是一个经典的多线程问题，因为不
 * 同的线程都在等待根本不可能被释放的锁，从而导致
 * 所有的任务都无法继续完成。在多线程技术中，“死
 * 锁”是必须避免的，因为这会造成线程“假死”
 */
public class Run {
    public static void main(String[] args) {
        try {
            DealThread t1 = new DealThread();
            t1.setFlag("a");

            Thread thread1 = new Thread(t1);
            thread1.start();

            Thread.sleep(100);

            t1.setFlag("b");
            Thread thread2 = new Thread(t1);
            thread2.start();
            // jps
            // jstack -l 3244
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}