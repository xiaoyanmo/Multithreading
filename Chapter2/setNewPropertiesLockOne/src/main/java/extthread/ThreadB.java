package extthread;

import entity.Userinfo;
import service.Service;

public class ThreadB extends Thread {

    private Service service;
    private Userinfo userinfo;

    public ThreadB(Service service,
                   Userinfo userinfo) {
        super();
        this.service = service;
        this.userinfo = userinfo;
    }

    @Override
    public void run() {
        service.serviceMethodA(userinfo);
    }

}
