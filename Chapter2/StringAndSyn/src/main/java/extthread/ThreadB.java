package extthread;

import service.Service;

public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        // 锁对象为字符串“AA”
        service.print("AA");
    }
}
