package extthread;

public class MyThread1 extends Thread {
    private Object lock;

    public MyThread1(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
//            System.out.println("< wait之前，synchronized外面");
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " 开始 wait time= " + System.currentTimeMillis());
                lock.wait();
                System.out.println(Thread.currentThread().getName() + " 结束 wait time= " + System.currentTimeMillis());
            }
//            System.out.println("wait之后，synchronized外面 >");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}
