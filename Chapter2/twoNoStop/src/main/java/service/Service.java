package service;

/**
 * 同步synchronized方法无限等待
 * 问题与解决方案
 */
public class Service {

//    synchronized public void methodA() {
//        System.out.println("methodA begin");
//        boolean isContinueRun = true;
//        while (isContinueRun) {
//        }
//        System.out.println("methodA end");
//    }
//
//
//    synchronized public void methodB() {
//        System.out.println("methodB begin");
//        System.out.println("methodB end");
//    }


    // 这时就可以使用同步块来解决这样的问题
    Object object1 = new Object();

    public void methodA() {
        synchronized (object1) {
            System.out.println("methodA begin");
            boolean isContinueRun = true;
            while (isContinueRun) {
            }
            System.out.println("methodA end");
        }
    }

    Object object2 = new Object();

    public void methodB() {
        synchronized (object2) {
            System.out.println("methodB begin");
            System.out.println("methodB end");
        }
    }
}
