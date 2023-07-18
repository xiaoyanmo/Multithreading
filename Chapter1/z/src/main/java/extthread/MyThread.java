package extthread;

import java.util.logging.Logger;

public class MyThread extends Thread {

    private  int i;

    public MyThread(int i) {
        super();
        this.i = i;
    }

    @Override
    public  void run() {
        Logger.getGlobal().info(String.valueOf(i));
    }

}
