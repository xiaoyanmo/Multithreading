package test;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        MyThreadA t1 = new MyThreadA(service);
        t1.start();
        Thread.sleep(5000);
        MyThreadB t2 = new MyThreadB(service);
        t2.start();
    }
}
