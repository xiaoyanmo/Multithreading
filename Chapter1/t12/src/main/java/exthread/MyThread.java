package exthread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(i);
        }
    }
}
