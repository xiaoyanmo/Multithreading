package run;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run1 {

    private static Timer timer = new Timer();
    private static int runCount = 0;
/**
 * 加上延迟之后，下一次任务的开始时间是上一次任务开始时间 + delay/period
 */
    /**
     * 字符串1时间：1652512620000 当前时间：1652512606871
     * 1 begin 运行了！时间为：Sat May 14 15:17:00 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:17:01 CST 2022
     * 1 begin 运行了！时间为：Sat May 14 15:17:03 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:17:04 CST 2022
     * 1 begin 运行了！时间为：Sat May 14 15:17:06 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:17:07 CST 2022
     * 1 begin 运行了！时间为：Sat May 14 15:17:09 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:17:10 CST 2022
     * 1 begin 运行了！时间为：Sat May 14 15:17:12 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:17:13 CST 2022
     */
    static public class MyTask1 extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("1 begin 运行了！时间为：" + new Date());
                Thread.sleep(1000);
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
     * 字符串1时间：1652512560000 当前时间：1652512553000
     * 1 begin 运行了！时间为：Sat May 14 15:16:00 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:16:00 CST 2022
     * 1 begin 运行了！时间为：Sat May 14 15:16:03 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:16:03 CST 2022
     * 1 begin 运行了！时间为：Sat May 14 15:16:06 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:16:06 CST 2022
     * 1 begin 运行了！时间为：Sat May 14 15:16:09 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:16:09 CST 2022
     * 1 begin 运行了！时间为：Sat May 14 15:16:12 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:16:12 CST 2022
     */
//    static public class MyTask1 extends TimerTask {
//        @Override
//        public void run() {
//            System.out.println("1 begin 运行了！时间为：" + new Date());
//            System.out.println("1   end 运行了！时间为：" + new Date());
//            runCount++;
//            if (runCount == 5) {
//                timer.cancel();
//            }
//        }
//    }
    public static void main(String[] args) {
        try {
            MyTask1 task1 = new MyTask1();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString1 = "2022-05-14 15:17:00";
            Date dateRef1 = sdf1.parse(dateString1);
            System.out.println("字符串1时间：" + dateRef1.getTime() + " 当前时间："
                    + new Date().getTime());
            timer.schedule(task1, dateRef1, 3000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
