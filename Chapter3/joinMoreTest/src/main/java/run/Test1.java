package run;

public class Test1 {
    public static void main(String[] args) throws
            InterruptedException {
        // 秒
        // 毫秒
        // 微秒
        // 纳秒
        long beginTime = System.currentTimeMillis();
        Thread.currentThread().join(2000, 999999);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - beginTime);
    }
}