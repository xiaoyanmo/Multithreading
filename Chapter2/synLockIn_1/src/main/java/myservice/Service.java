package myservice;

public class Service {
    synchronized public void service2() {
        System.out.println("进入……service2");
        // 三次进锁
        service3();
    }

    synchronized public void service1() {
        System.out.println("进入……service1");
        // 二次进锁
        service2();
    }

    synchronized public void service3() {
        System.out.println("进入……service3");
    }

}
