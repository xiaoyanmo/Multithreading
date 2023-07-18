package extthread;

public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("run begin Timer=" +
                    System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("run end Timer=" +
                    System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
