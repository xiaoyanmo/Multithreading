package extthread;

public class MyThread2 extends Thread {
    private Object lock;

    public MyThread2(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
//        System.out.println("{ notify之前，synchronized 外面 ");
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName()+" 开始notify time= " + System.currentTimeMillis());
            lock.notify();
            System.out.println(Thread.currentThread().getName()+" 结束notify time= " + System.currentTimeMillis());
        }
//        System.out.println("notify之后，synchronized 外面 } ");
    }
}
