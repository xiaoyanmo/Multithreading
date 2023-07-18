package test;

public class MyService {

    private Object lock = new Object();
    private MyList list = new MyList();

    public void waitMethod() {
        try {
            synchronized (lock) {
                if (list.size() != 5) {
                    System.out.println(
                            "begin wait " + System.currentTimeMillis() + " "
                                    + Thread.currentThread().getName());
                    lock.wait();
                    System.out.println(
                            " end wait " + System.currentTimeMillis() + " "
                                    + Thread.currentThread().getName());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void notifyMethod() {
        try {
            synchronized (lock) {
                System.out.println("begin notify " + System.currentTimeMillis() + " " + Thread.currentThread().getName());
                for (int i = 0; i < 10; i++) {
                    list.add();
                    if (list.size() == 5) {
                        lock.notify();
                        System.out.println("仅仅是发出通知而已，wait后面的代码并没有立即执行，因为锁没有释放");
                    }
                    System.out.println("add次数：" + (i + 1));
                    Thread.sleep(1000);
                }
                System.out.println("  end notify " + System.currentTimeMillis() + " " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}