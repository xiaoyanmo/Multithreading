package extthread;

import service.MyService;

public class MyThreadB extends Thread {
    private MyService myService;

    public MyThreadB(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.notifyMethod();
    }

}
