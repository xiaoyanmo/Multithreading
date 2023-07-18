package extthread;

import service.HasSelfPrivateNum;

public class ThreadA extends Thread {
    /**
     * 注意该引用，现在指向的和ThreadB是同一个对象
     */
    private HasSelfPrivateNum numRef;

    public ThreadA(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }

}
