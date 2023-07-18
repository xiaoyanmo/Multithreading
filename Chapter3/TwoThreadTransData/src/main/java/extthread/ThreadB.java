package extthread;

import mylist.MyList;

public class ThreadB extends Thread {

    private MyList list;

    public ThreadB(MyList list) {
        super();
        this.list = list;
    }

    /**
     * 虽然两个线程间实现了通信，但缺点是线程
     * ThreadB.java不停地通过while语句轮询机制来检测某一个条件，这样会浪费CPU资源。
     */
    @Override
    public void run() {
        try {
            while (true) {
                //  如果轮询的时间间隔很小，则更浪费CPU资源；如果轮询的时间间隔很大，则有可能取不到想要的数据。
//                Thread.sleep(2000);
                if (list.size() == 5) {
                    System.out.println(Thread.currentThread().getName() + " ==5了，线程b要退出了！");
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
