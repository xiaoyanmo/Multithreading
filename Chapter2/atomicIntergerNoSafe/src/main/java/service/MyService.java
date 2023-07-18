package service;

import java.util.concurrent.atomic.AtomicLong;

public class MyService {

    public static AtomicLong aiRef = new AtomicLong();

    //	synchronized  // 注意调用方法是否是原子性
    public void addNum() {
        System.out.println(Thread.currentThread().getName() + "加了100之后的值是:" + aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }

}
