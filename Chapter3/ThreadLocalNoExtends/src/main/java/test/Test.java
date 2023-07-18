package test;

public class Test {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                if (Tools.tl.get() == null) {
                    Tools.tl.set("此值是main线程放入的！");
                }
                System.out.println("\t\t在Main线程中取值="
                        + Tools.tl.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}