package run;

import testpackage.MyService;
import testpackage.MyThreadA;
import testpackage.MyThreadB;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Run {
    public static void main(String[] args) {
        try {
            MyService object = new MyService();
            MyThreadA threadA = new MyThreadA(object);
            threadA.start();
            Thread.sleep(100);
            MyThreadB threadB = new MyThreadB(object);
            threadB.start();
            Thread.sleep(3000);
            threadA.stop();
            System.out.println("stop()执行后，在下方开始打印 username和password。");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
