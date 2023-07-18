package myrunnable;

import java.util.logging.Logger;

/**
 * Constructor and Description
 * Thread()
 * 分配一个新的 Thread对象。
 * Thread(Runnable target)
 * 分配一个新的 Thread对象。
 * Thread(Runnable target, String name)
 * 分配一个新的 Thread对象。
 * Thread(String name)
 * 分配一个新的 Thread对象。
 * Thread(ThreadGroup group, Runnable target)
 * 分配一个新的 Thread对象。
 * Thread(ThreadGroup group, Runnable target, String name)
 * 分配一个新的 Thread对象，使其具有 target作为其运行对象，具有指定的 name作为其名称，属于 group引用的线程组。
 * Thread(ThreadGroup group, Runnable target, String name, long stackSize)
 * 分配一个新的 Thread对象，以便它具有 target作为其运行对象，将指定的 name正如其名，以及属于该线程组由称作 group ，并具有指定的 堆栈大小 。
 * Thread(ThreadGroup group, String name)
 * 分配一个新的 Thread对象。
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        Logger.getGlobal().info("运行中!\t" + Thread.currentThread().getName());
    }
}
