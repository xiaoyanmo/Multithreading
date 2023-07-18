package test;

public class Test {
    public static void main(String[] args) {
        MyService service = new MyService();
        MyThreadA[] array = new MyThreadA[10];
        for (int i = 0; i < 10; i++) {
            array[i] = new MyThreadA(service);
        }
        for (int i = 0; i < 10; i++) {
            array[i].start();
        }
        MyThreadB b = new MyThreadB(service);
        b.start();
    }
}