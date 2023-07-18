package com.mythread.www;

import java.util.logging.Logger;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        Logger.getGlobal().info("MyThread\t" + Thread.currentThread().getName());
    }
}
