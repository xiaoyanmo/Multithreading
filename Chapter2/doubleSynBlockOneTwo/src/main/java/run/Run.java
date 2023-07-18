package run;

import extthread.ThreadA;
import extthread.ThreadB;
import service.ObjectService;

/**
 * 两个方法都是锁this
 */
public class Run {
    /**
     * 在使用同步synchronized（this）代码块时需要
     * 注意，当一个线程访问object的一个
     * synchronized（this）同步代码块时，其他线程对同
     * 一个object中所有其他synchronized（this）同步代
     * 码块的访问将被阻塞，这说明synchronized使用的对
     * 象监视器是同一个，即使用的锁是同一个
     *
     * @param args
     */
    public static void main(String[] args) {
        ObjectService service = new ObjectService();

        ThreadA a = new ThreadA(service);
        a.setName("a");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("b");
        b.start();
    }

}
