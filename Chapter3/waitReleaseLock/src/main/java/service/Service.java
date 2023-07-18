package service;

public class Service {

    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait()\t" + Thread.currentThread().getId() + "\t是否持有锁\t" + Thread.holdsLock(lock));
                lock.wait();
                Thread.sleep(3000); // 按正常顺序执行三秒结束，注意时间越长放锁时间越长，
                System.out.println("  end wait()\t" + Thread.currentThread().getId() + "\t是否持有锁\t" + Thread.holdsLock(lock));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
