package test;

public class Test2 {
    /**
     * 线程不能永远等待下去，那样程序就停止不前，
     * 不能继续向下运行了，
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            String lock = new String();
            System.out.println("syn上面");
            synchronized (lock) {
                System.out.println("syn第一行");
                lock.wait();
                System.out.println("wait下的代码！");
            }
            System.out.println("syn下面的代码");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
