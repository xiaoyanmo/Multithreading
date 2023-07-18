package test;

public class OutClass {
    static class InnerClass1 {
        public void method1(InnerClass2 class2) { // 锁对象是Class对象InnerClass2   method1 和 InnerClass2实例对象的method1是同步步执行
            String threadName = Thread.currentThread().getName();
            synchronized (class2) { // class2 实例对象作为锁，并且这个实例对象有同步方法，和当前方法是顺序执行
                System.out.println(threadName + " 进入InnerClass1类中的method1方法");
                for (int i = 0; i < 10; i++) {
                    System.out.println("i=" + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {

                    }
                }
                System.out.println(threadName + " 离开InnerClass1类中的method1方法");
            }
        }

        public synchronized void method2() {  // 锁对象是InnerClass1的实例对象   method1 和 method2是异步执行
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " 进入InnerClass1类中的method2方法");
            for (int j = 0; j < 10; j++) {
                System.out.println("j=" + j);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
            }
            System.out.println(threadName + " 离开InnerClass1类中的method2方法");
        }
    }

    static class InnerClass2 {
        public synchronized void method1() { // 锁对象是InnerClass2的实例对象  method1 和 InnerClass2实例对象的method1是同步步执行
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " 进入InnerClass2类中的method1方法");
            for (int k = 0; k < 10; k++) {
                System.out.println("k=" + k);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
            }
            System.out.println(threadName + " 离开InnerClass2类中的method1方法");
        }
    }
}
