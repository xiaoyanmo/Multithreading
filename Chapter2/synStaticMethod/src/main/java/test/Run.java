package test;

import extthread.ThreadA;
import extthread.ThreadB;

/**
 * 关键字synchronized还可以应用在static静态方
 * 法上，如果这样写，那是对当前的*.java文件对应的
 * Class类对象进行持锁，Class类的对象是单例的，更
 * 具体地说，在静态static方法上使用synchronized关
 * 键字声明同步方法时，使用当前静态方法所在类对应
 * Class类的单例对象作为锁
 */
public class Run {

    public static void main(String[] args) {

        ThreadA a = new ThreadA();
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB();
        b.setName("B");
        b.start();

    }

}
