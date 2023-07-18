package service;

import entity.Userinfo;

public class Service {
    /**
     * 只要对象不变就是同步效果，因为A线程和B线程
     * 持有的锁对象永远为同一个，仅仅对象的属性改变
     * 了，但对象未发生改变
     * @param userinfo
     */
    public void serviceMethodA(Userinfo userinfo) {
        synchronized (userinfo) {
            try {
                System.out.println(Thread.currentThread().getName());
                userinfo.setUsername("abcabcabc");
                Thread.sleep(3000);
                System.out.println("end! time=" + System.currentTimeMillis());
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}
