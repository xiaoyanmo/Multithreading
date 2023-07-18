package service;

public class Service {
    synchronized public void testMethod() {
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("ThreadName=" + Thread.currentThread().getName() + " run beginTime=" + System.currentTimeMillis());
            int i = 1;
            while (i == 1) {
                if (("" + Math.random()).substring(0, 8).equals("0.123456")) {
                    System.out.println("ThreadName=" + Thread.currentThread().getName() + " run   exceptionTime=" + System.currentTimeMillis());
                    try {
                        Integer.parseInt("a");
                    } catch (NumberFormatException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " run Time=" + System.currentTimeMillis());
        }
        System.out.println("同步方法异常后内容：" + Thread.currentThread().getName());
    }
}
