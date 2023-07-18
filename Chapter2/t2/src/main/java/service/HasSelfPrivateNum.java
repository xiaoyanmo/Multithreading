package service;

public class HasSelfPrivateNum {
    // 如果对象仅有一个实例变量，则有可能出现覆盖的情况。
    // 单例模式中的实例变量呈非线程安全状态
    private int num = 0;

    /**
     * 查看字节码
     * cmd:  javap -c -v .\HasSelfPrivateNum.class
     * ...
     * public synchronized void addI(java.lang.String);
     * descriptor: (Ljava/lang/String;)V
     * flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
     * Code:
     * stack=3, locals=3, args_size=2
     * ...
     *
     * @param username
     */
    // 先异步，后同步，同步时持有对象锁，并打上标记ACC_SYNCHRONIZED
//    synchronized
    public void addI(String username) {
        try {
            if (username.equals("a")) {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(username + " num=" + num);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

}
