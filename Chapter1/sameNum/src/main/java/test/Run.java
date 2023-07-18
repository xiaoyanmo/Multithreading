package test;

import extthread.Human;
import extthread.MyThread;
import extthread.People;

public class Run {

    public static void main(String[] args) {
        // 2个实例指向1个对象
        People people = new People();

        Human human1 = new Human(people);
        System.out.println(human1.hashCode());
        System.out.println(System.identityHashCode(human1));


        Human human2 = new Human(people);
        System.out.println(human2.hashCode());
        System.out.println(System.identityHashCode(human2));

        System.out.println();

        MyThread run = new MyThread();

        // 5个实例指向一个对象
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);
        Thread t4 = new Thread(run);
        Thread t5 = new Thread(run);

        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
        System.out.println(t3.hashCode());
        System.out.println(t4.hashCode());
        System.out.println(t5.hashCode());
        System.out.println();

        System.out.println(System.identityHashCode(t1));
        System.out.println(System.identityHashCode(t2));
        System.out.println(System.identityHashCode(t3));
        System.out.println(System.identityHashCode(t4));
        System.out.println(System.identityHashCode(t5));


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

}
