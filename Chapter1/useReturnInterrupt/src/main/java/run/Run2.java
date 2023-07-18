package run;

import extthread.MyThread2;

public class Run2 {
    /**
     * 虽然使用“return；”较“抛异常”法在代码结
     * 构上可以更加方便地实现线程的停止，不过还是建议
     * 使用“抛异常”法，因为在catch块中可以对异常的信
     * 息进行统一的处理，例如，使用“return；”来设计
     * 代码：
     *
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        MyThread2 t = new MyThread2();
        t.start();
        // 这个会输出日志
//        t.interrupt();
        Thread.sleep(2000);
        t.interrupt();
    }

}
