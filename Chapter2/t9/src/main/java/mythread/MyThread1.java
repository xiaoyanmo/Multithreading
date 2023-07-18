package mythread;

import mylist.MyOneList;
import service.MyService;

public class MyThread1 extends Thread {

    private MyOneList myOneList;

    public MyThread1(MyOneList myOneList) {
        super();
        this.myOneList = myOneList;
    }

    @Override
     public void run() {
//        MyService msRef = new MyService();
//        System.out.println(Thread.currentThread().getName() + " 线程操作自己实例属性 " + list);
//        System.out.println(Thread.currentThread().getName() + " 线程操作自己实例属性 " + System.identityHashCode(list) + " 并创建业务对象 " + System.identityHashCode(msRef));
//        msRef.addServiceMethod(list, "A");
        synchronized (myOneList) {
            if (myOneList.getSize() < 1) {
                System.out.println(Thread.currentThread().getName() + " 线程进入业务对象内的同步代码块");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                myOneList.add("A");
            }
        }

    }

}
