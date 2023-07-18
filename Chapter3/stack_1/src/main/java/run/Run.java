package run;

import entity.MyStack;
import extthread.C_Thread;
import extthread.P_Thread;
import service.C;
import service.P;

public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        P p = new P(myStack);
        C r = new C(myStack);

        P_Thread pThread = new P_Thread(p);
        C_Thread rThread = new C_Thread(r);
        pThread.start();
        rThread.start();
    }

}
