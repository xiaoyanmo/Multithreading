package run;

public class Test {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void method1() {
        synchronized (lock1) {
            System.out.println("method1");
            method2();
        }
    }

    public void method2() {
        synchronized (lock2) {
            System.out.println("method2");
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        new Thread(() -> test.method1()).start();
    }
}
