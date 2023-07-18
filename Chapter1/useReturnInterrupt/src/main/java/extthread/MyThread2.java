package extthread;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(300);
            // insert操作
            if (this.interrupted()) {
                throw new InterruptedException();
            }
            // update操作
            if (this.interrupted()) {
                throw new InterruptedException();
            }
            // delete操作
            if (this.interrupted()) {
                throw new InterruptedException();
            }
            // select操作
            if (this.interrupted()) {
                throw new InterruptedException();
            }
            System.out.println("for for for for for");
        } catch (InterruptedException e) {
            System.out.println("写入log info");
            e.printStackTrace();
        }
    }
}
