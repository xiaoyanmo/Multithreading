package myservice;

public class Main {
    // 和子类共同使用一个属性
    public int i = 10;

    synchronized
    public void operateIMainMethod() {
        try {
            i--;
            System.out.println("main print i=" + i);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
