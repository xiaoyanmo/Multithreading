package extthread;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // insert操作
        if (this.interrupted()) {
            System.out.println("写入log info insert操作");
            return;
        }
        // update操作
        if (this.interrupted()) {
            System.out.println("写入log info update操作");
            return;
        }
        // delete操作
        if (this.interrupted()) {
            System.out.println("写入log info delete操作");
            return;
        }
        // select操作
        if (this.interrupted()) {
            System.out.println("写入log info select操作");
            return;
        }
        System.out.println("for for for for for");
    }
}