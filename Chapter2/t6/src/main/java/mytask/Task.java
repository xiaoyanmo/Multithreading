package mytask;

public class Task {

    private String getData1;
    private String getData2;

    /**
     * 当一个线程访问
     * object的一个synchronized同步代码块时，另一个线
     * 程仍然可以访问该object对象中的非
     * synchronized（this）同步代码块
     */
    public void doLongTimeTask() {
        try {
            System.out.println(Thread.currentThread().getName() + " begin task");
            Thread.sleep(3000);

            String privateGetData1 = "长时间处理任务后从远程返回的值1 threadName="
                    + Thread.currentThread().getName();
            String privateGetData2 = "长时间处理任务后从远程返回的值2 threadName="
                    + Thread.currentThread().getName();
            // 线程A和B两线程一起并发到上面输出
            // 线程A和B两线程到这里就开始排队输出
            synchronized (this) {
                getData1 = privateGetData1;
                getData2 = privateGetData2;
                System.out.println(getData1);
                System.out.println(getData2);
                System.out.println(Thread.currentThread().getName() + " end task");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
