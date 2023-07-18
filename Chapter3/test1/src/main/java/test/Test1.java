package test;

public class Test1 {
    /**
     * java.lang.IllegalMonitorStateException,表示无锁
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            String newString = new String("");
            newString.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
