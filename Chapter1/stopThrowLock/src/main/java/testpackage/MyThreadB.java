package testpackage;

public class MyThreadB extends Thread {
    private MyService object;

    public MyThreadB(MyService object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        System.out.println("username=" + object.getUsername());
        System.out.println("password=" + object.getPassword());
    }
}