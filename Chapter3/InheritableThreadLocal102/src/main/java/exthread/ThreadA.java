package exthread;

import tools.Tools;

public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("在ThreadA线程中取值=" +
                        Tools.tl.get());
                Thread.sleep(1000);
                if (i == 5) {
                    Tools.tl.set("我是ThreadA的newnewnewnew最 新的值！");
                    System.out.println("ThreadA已经存在最的值--------------- - ");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}