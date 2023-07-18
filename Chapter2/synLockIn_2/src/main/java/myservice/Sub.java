package myservice;

public class Sub extends Main {
    // 继承父类的公有属性
    // 此处有覆盖父类方法，先执行子类，然后再调用父类方法
    synchronized
    public void operateISubMethod() {
        try {
            while (i > 0) {
                i--;
                System.out.println("sub print i=" + i);
                Thread.sleep(100);
                this.operateIMainMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
