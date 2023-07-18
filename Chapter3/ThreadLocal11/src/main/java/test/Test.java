package test;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws
            IOException, InterruptedException {
        ThreadLocal local = new ThreadLocal();
        local.set("我是任意的值");
        System.out.println(local.get());
    }
}