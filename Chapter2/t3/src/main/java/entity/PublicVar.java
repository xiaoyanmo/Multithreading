package entity;

public class PublicVar {

    public String username = "A";
    public String password = "AA";

    // 获得setValue方法所在对象的锁
    synchronized public void setValue(String username, String password) {
        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;

            System.out.println("setValue method thread name="
                    + Thread.currentThread().getName() + " username="
                    + username + " password=" + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 异步获取实例变量的值，容易出现脏读
     */
//    synchronized
    public void getValue() {
        System.out.println("getValue method thread name=" + Thread.currentThread().getName() + " username=" + username + " password=" + password);
    }
}
