package service;

import mylist.MyOneList;

/**
 * 两个线程创建两个不同的业务对象，并让该业务对象操作各自的私有实例属性
 */
public class MyService {

    /**
     * 可以看成是本业务对象的实例变量MyOneList list,
     *
     * @param myOneList
     * @param data
     * @return
     */
    // 加这个“synchronized”也不管用
    public MyOneList addServiceMethod(MyOneList myOneList, String data) {
        try {
            System.out.println(System.identityHashCode(myOneList));
            // 两个线程操作同一个业务对象实例，并各自创建第二个不同的业务对象来操作这个相同的业务对象
            // 两个线程调用方法是异步的，进入同步是顺序的
            // 简单理解就是，两个线程同时操作自己的私有实例属性，并发变更操作
            // 两个线程在各自创建的业务对象内操作自己的实例属性
            // 两个线程调用业务对象方法无序，但是操作同一个实例对象，此时必须加锁。调用无序，操作同一个对象要加锁
            /**
             * B 线程操作自己实例属性 mylist.MyOneList@6213df96
             * A 线程操作自己实例属性 mylist.MyOneList@6213df96
             * A 线程操作自己实例属性 1645469590 并创建业务对象 1348304345
             * B 线程操作自己实例属性 1645469590 并创建业务对象 1361186909
             * A 线程进入实例属性对象的getSize方法	1993808698
             * B 线程进入实例属性对象的getSize方法	1993808698
             * A 线程进入创建业务对象内	1348304345
             * B 线程进入创建业务对象内	1361186909
             * A 线程进入实例属性对象的add方法	1993808698
             * B 线程进入实例属性对象的add方法	1993808698
             * main 线程进入实例属性对象的getSize方法	1993808698
             * listSize=2
             */
//            if (myOneList.getSize() < 1) {
//                System.out.println(Thread.currentThread().getName() + " 线程进入创建业务对象内"+ "\t" + System.identityHashCode(this));
//                Thread.sleep(2000);
//                myOneList.add(data);
//            }
            synchronized (myOneList) {
                System.out.println(Thread.currentThread().getName() + " 线程进入创建业务对象内" + "\t" + System.identityHashCode(this));
                if (myOneList.getSize() < 1) {
                    System.out.println(Thread.currentThread().getName() + " 线程进入业务对象内的同步代码块");
                    Thread.sleep(2000);
                    myOneList.add(data);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myOneList;
    }

}
