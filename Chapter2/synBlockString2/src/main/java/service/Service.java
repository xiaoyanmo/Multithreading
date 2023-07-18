package service;

public class Service {

    private final String anyString = new String();

    public void a() {
        try {
            // 锁的非this对象,monitorenter和monitorexit
            synchronized (anyString) {
                System.out.println("a begin");
                Thread.sleep(3000);
                System.out.println("a   end");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 锁this对象,ACC_SYNCHRONIZED
     */
    synchronized public void b() {
        System.out.println("b begin");
        System.out.println("b   end");
    }

}
