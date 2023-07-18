package extobject;

public class MyObject {
/*    public synchronized void methodA();
    descriptor: ()V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED*/

    synchronized public void methodA() {
        try {
            System.out.println("begin methodA threadName="
                    + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end endTime=" + System.currentTimeMillis() + "\t" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //    synchronized
    public void methodB() {
        try {
            System.out.println("begin methodB threadName="
                    + Thread.currentThread().getName() + " begin time="
                    + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end\t" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
