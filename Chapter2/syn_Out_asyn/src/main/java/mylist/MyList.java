package mylist;

import java.util.ArrayList;
import java.util.List;

/**
 * 验证方法被调用是随机的
 * 同步代码块放在非同步synchronized方法中进行声明，
 * 并不能保证调用方法的线程的执行同步（顺序性），
 * 也就是线程调用方法的顺序是无序的，
 * 虽然在同步块中执行的顺序是同步的。
 */
// 线程内调用业务对象的方法是异步的（线程调用方法无序），但是线程进入同步方法内是顺序的（线程进入同步方法有序）。
public class MyList {

    private List list = new ArrayList();

    /**
     * 同步方法中的代码是同步输出的，
     * 所以线程的“进入”与“退出”是成对出现的，
     * 但方法被调用的时机是随机的，
     * 即线程A和线程B的执行是异步的
     *
     * @param username
     */
    synchronized public void add(String username) {
        System.out.println("ThreadName=" + Thread.currentThread().getName()
                + "执行了add方法！");
        list.add(username);
        System.out.println("ThreadName=" + Thread.currentThread().getName()
                + "退出了add方法！");
    }

    synchronized public int getSize() {
        System.out.println("ThreadName=" + Thread.currentThread().getName()
                + "执行了getSize方法！");
        int sizeValue = list.size();
        System.out.println("ThreadName=" + Thread.currentThread().getName()
                + "退出了getSize方法！");
        return sizeValue;
    }

}
