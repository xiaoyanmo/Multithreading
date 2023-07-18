package demo;

public class MyDemo {
    public static void main(String[] args) {
        MyDemoThread myDemoThread = new MyDemoThread();
        myDemoThread.start();
        myDemoThread.interrupt();

    }
}
