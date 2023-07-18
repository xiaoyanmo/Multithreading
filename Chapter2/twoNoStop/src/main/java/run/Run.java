package run;

import extthread.ThreadA;
import extthread.ThreadB;
import service.Service;

public class Run {

    public static void main(String[] args) {
        Service service = new Service();

        ThreadA athread = new ThreadA(service);
        athread.start();

        ThreadB bthread = new ThreadB(service);
        bthread.start();
    }

}
