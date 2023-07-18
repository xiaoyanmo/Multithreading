package run;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run2 {

    private static Timer timer = new Timer();
    private static int runCount = 0;

    static public class MyTask1 extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("1 begin 运行了！时间为：" + new Date());
                Thread.sleep(5000);
                System.out.println("1   end 运行了！时间为：" + new Date());
                runCount++;
                if (runCount == 5) {
                    timer.cancel();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 字符串1时间：2022年5月14日 下午3:02:00 当前时间：2022年5月14日 下午3:01:36
     * 1 begin 运行了！时间为：Sat May 14 15:02:00 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:02:05 CST 2022
     * 下次执行任务的时间，用的是上次执行时间的结束时间
     * 1 begin 运行了！时间为：Sat May 14 15:02:05 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:02:10 CST 2022
     * 1 begin 运行了！时间为：Sat May 14 15:02:10 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:02:15 CST 2022
     * 1 begin 运行了！时间为：Sat May 14 15:02:15 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:02:20 CST 2022
     * 1 begin 运行了！时间为：Sat May 14 15:02:20 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:02:25 CST 2022
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            MyTask1 task1 = new MyTask1();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString1 = "2022-05-14 15:02:00";
            Date dateRef1 = sdf1.parse(dateString1);
            System.out.println("字符串1时间：" + dateRef1.toLocaleString() + " 当前时间："
                    + new Date().toLocaleString());
            timer.schedule(task1, dateRef1, 2000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
