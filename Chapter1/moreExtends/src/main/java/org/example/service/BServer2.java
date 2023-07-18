package org.example.service;

public class BServer2 extends AServer implements Runnable {
    public void b_save_method() {
        System.out.println("b中的保存数据方法被执行");
    }

    @Override
    public void run() {
        b_save_method();
    }
}