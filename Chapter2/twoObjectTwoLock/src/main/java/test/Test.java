package test;

//定义一个共享资源类
class SharedResource {
    private int value;

    public SharedResource(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

//定义一个线程类，实现Runnable接口
class MyThread implements Runnable {
    private SharedResource resource1; //第一个共享资源对象
    private SharedResource resource2; //第二个共享资源对象

    public MyThread(SharedResource resource1, SharedResource resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        //获取当前线程的名称
        String name = Thread.currentThread().getName();
        //对第一个共享资源对象加锁
        synchronized (resource1) {
            System.out.println(name + "获取了resource1的锁");
            //对第二个共享资源对象加锁
            synchronized (resource2) {
                System.out.println(name + "获取了resource2的锁");
                //对两个共享资源对象的值进行操作
                int v1 = resource1.getValue();
                int v2 = resource2.getValue();
                resource1.setValue(v1 + 1);
                resource2.setValue(v2 - 1);
                System.out.println(name + "修改了resource1和resource2的值");
            }
            //释放第二个共享资源对象的锁
            System.out.println(name + "释放了resource2的锁");
        }
        //释放第一个共享资源对象的锁
        System.out.println(name + "释放了resource1的锁");
    }
}

//定义一个测试类，包含main方法
public class Test {
    public static void main(String[] args) {
        //创建两个共享资源对象
        SharedResource resource1 = new SharedResource(10);
        SharedResource resource2 = new SharedResource(20);
        //创建两个线程对象，分别传入相反的共享资源对象
        Thread t1 = new Thread(new MyThread(resource1, resource2), "线程一");
        Thread t2 = new Thread(new MyThread(resource2, resource1), "线程二");
        //启动两个线程
        t1.start();
        t2.start();
    }
}