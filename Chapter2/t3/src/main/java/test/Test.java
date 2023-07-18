package test;

import entity.PublicVar;
import extthread.ThreadA;

public class Test {

    public static void main(String[] args) {
        try {
            PublicVar publicVarRef = new PublicVar();
            ThreadA thread = new ThreadA(publicVarRef);
            thread.start();

            Thread.sleep(200);// 打印结果受此值大小影响

            publicVarRef.getValue(); // 注意此方法是异步方法
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
