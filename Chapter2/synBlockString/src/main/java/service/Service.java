package service;

public class Service {

    private String usernameParam;
    private String passwordParam;
    // 第一步，使用业务对象的私有属性，只有一份
//    private String anyString = new String();

    /**
     * 锁非this对象具有一定的优点：如果一个类中有
     * 很多个synchronized方法，则这时虽然能实现同步，
     * 但影响运行效率，如果使用同步代码块锁非this对
     * 象，则synchronized（非this）代码块中的程序与同
     * 步方法是异步的，因为有两把锁，不与其他锁this同
     * 步方法争抢this锁，可大大提高运行效率。
     *
     * @param username
     * @param password
     */
    public void setUsernamePassword(String username, String password) {
        try {
            /**
             * 每次锁定的不是同一个对象实例
             */
            /**
             * identityHashCode()方法是Java中的一个静态方法，它返回给定对象的哈希码。
             * 与默认的hashCode()方法不同，它不会调用对象的hashCode()方法，
             * 而是返回对象的内存地址的哈希码。
             * 这个方法可以用来比较两个对象是否相等，因为如果两个对象相等，它们的哈希码也应该相等。
             * 下面是一个使用identityHashCode()方法的示例代码：
             *
             * String str1 = "Hello";
             * String str2 = "Hello";
             * System.out.println(System.identityHashCode(str1));
             * System.out.println(System.identityHashCode(str2));
             * 这段代码将输出两个相同的哈希码，因为它们都指向同一个字符串对象。如果我们使用默认的hashCode()方法，那么输出将是不同的，因为默认的hashCode()方法会根据字符串内容计算哈希码。
             */
            // 第一步（同步）
//            System.out.println("业务对象私有字符串属性对象实例\t" + System.identityHashCode(anyString));
            // 第二步（异步），先注释掉所有第一步
            String anyString = new String();
            System.out.println("业务对象方法内局部字符串变量对象实例\t" + System.identityHashCode(anyString));
            synchronized (anyString) {
                System.out.println("线程名称为：" + Thread.currentThread().getName() + "在 " + System.currentTimeMillis() + " 进入同步块");
                usernameParam = username;
                Thread.sleep(3000);
                passwordParam = password;
                System.out.println("线程名称为：" + Thread.currentThread().getName() + "在 " + System.currentTimeMillis() + " 离开同步块");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
