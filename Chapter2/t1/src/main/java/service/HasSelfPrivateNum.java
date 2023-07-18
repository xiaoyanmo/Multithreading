package service;

import java.util.logging.Logger;

public class HasSelfPrivateNum {
    /**
     * 方法中的变量不存在非线程安全问题，永远都是
     * 线程安全的，这是因为方法内部的变量具有私有特性
     *
     * @param username
     */
    public void addI(String username) {
        try {
            int num;
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
            Logger.getGlobal().info(e.getMessage());
        }
    }

}
