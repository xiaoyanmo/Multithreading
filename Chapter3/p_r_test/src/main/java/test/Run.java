package test;

import entity.C;
import entity.P;
import extthread.ThreadC;
import extthread.ThreadP;

public class Run {

    public static void main(String[] args) {

        String lock = new String("");
        P p = new P(lock);
        C r = new C(lock);

        ThreadP pThread = new ThreadP(p);
        ThreadC rThread = new ThreadC(r);

        pThread.start();
        rThread.start();
    }

}
