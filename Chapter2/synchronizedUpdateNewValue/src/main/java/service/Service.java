package service;

public class Service {

//  volatile 可见性， volatile关键字最致命的缺点是不支持原子性

    private boolean isContinueRun = true;

    public void runMethod() {
        String anyString = new String();
        while (isContinueRun == true) {
            // 锁对象，本身特性，可见性，原子性，顺序性
//            synchronized (anyString) {
//            }
        }
        System.out.println("停下来了！");
    }

    public void stopMethod() {
        // 说白了就是将这个实例变量和公共堆栈中的变量同步一下，变成可见
        isContinueRun = false;
    }
}
