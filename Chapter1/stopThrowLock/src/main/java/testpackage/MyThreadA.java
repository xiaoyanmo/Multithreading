package testpackage;

public class MyThreadA extends Thread {
    private MyService object;

    public MyThreadA(MyService object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        object.printString("b", "bb");
    }
}