package test2.extthread;

import test2.extobject.MyObject;

public class ThreadB extends Thread {
    private MyObject object;

    public ThreadB(MyObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.speedPrintString();
    }
}
