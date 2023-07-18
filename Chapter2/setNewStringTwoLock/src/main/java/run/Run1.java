package run;

import extthread.ThreadA;
import extthread.ThreadB;
import myservice.MyService;

public class Run1 {

    public static void main(String[] args) throws InterruptedException {

        MyService service = new MyService();

        ThreadA a = new ThreadA(service);
        a.setName("A");

        ThreadB b = new ThreadB(service);
        b.setName("B");

        a.start();
        Thread.sleep(50);// 存在50毫秒  异步执行 + 改变锁对象
        b.start();
    }
}
