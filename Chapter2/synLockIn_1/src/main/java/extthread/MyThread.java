package extthread;

import myservice.Service;

public class MyThread extends Thread {
    @Override
    public void run() {
        // 私有变量安全
        Service service = new Service();
        // 首次进入锁
        service.service1();
    }

}
