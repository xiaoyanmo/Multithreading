package test;

import extthread.ThreadA;
import extthread.ThreadB;
import service.Service;

/**
 * 多个线程调用同一个对象中的不同名称的synchronized同步方法或synchronized（this）同步代码块时，调用的效果是按顺序执行，即同步。
 * synchronized同步方法或synchronized（this）同步代码块分别有两种作用。
 * synchronized同步方法的作用：
 * 1）对其他synchronized同步方法或synchronized（this）同步代码块调用呈同步效果。
 * 2）同一时间只有一个线程可以执行synchronized同步方法中的代码。
 * synchronized（this）同步代码块的作用：
 * 1）对其他synchronized同步方法或synchronized（this）同步代码块调用呈同步效果。
 * 2）同一时间只有一个线程可以执行synchronized（this）同步代码块中的代码。
 * 除了使用synchronized（this）格式来创建同步代码块，其实Java还支持将“任意对象”作为锁来实现同步的功能，这个“任意对象”大多数是实例变量及方法的参数。
 * 使用格式为synchronized（非this对象）。
 * synchronized（非this对象x）同步代码块的作用：当多个线程争抢相同的“非this对象x”的锁时，同一时间只有一个线程可以执行synchronized（非this对象x）同步代码块中的代码。
 * synchronized（非this对象x）同步代码块的作用可以通过下面的示例验证。
 */
public class Run {

    public static void main(String[] args) {
        Service service = new Service();

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();


    }

}
