package run;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run3 {

    private static Timer timer = new Timer();
    private static int runCount = 0;
/**
 * 加上延迟之后，下一次任务的开始时间是上一次任务的结束时间
 */
    /**
     * 字符串1时间：2022年5月14日 下午3:18:00 当前时间：2022年5月14日 下午3:18:07
     * 1 begin 运行了！时间为：Sat May 14 15:18:07 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:18:08 CST 2022
     * 1 begin 运行了！时间为：Sat May 14 15:18:08 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:18:09 CST 2022
     * 1 begin 运行了！时间为：Sat May 14 15:18:09 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:18:10 CST 2022
     * 1 begin 运行了！时间为：Sat May 14 15:18:10 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:18:11 CST 2022
     * 1 begin 运行了！时间为：Sat May 14 15:18:12 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:18:13 CST 2022
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
     * 字符串1时间：2022年5月14日 下午3:11:00 当前时间：2022年5月14日 下午3:10:28
     * 1 begin 运行了！时间为：Sat May 14 15:11:00 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:11:00 CST 2022
     * 1 begin 运行了！时间为：Sat May 14 15:11:03 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:11:03 CST 2022
     * 1 begin 运行了！时间为：Sat May 14 15:11:06 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:11:06 CST 2022
     * 1 begin 运行了！时间为：Sat May 14 15:11:09 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:11:09 CST 2022
     * 1 begin 运行了！时间为：Sat May 14 15:11:12 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:11:12 CST 2022
     */
//    static public class MyTask1 extends TimerTask {
//        @Override
//        public void run() {
//
//            System.out.println("1 begin 运行了！时间为：" + new Date());
//            System.out.println("1   end 运行了！时间为：" + new Date());
//            runCount++;
//            if (runCount == 5) {
//                timer.cancel();
//            }
//
//        }
//    }
    public static void main(String[] args) {
        try {
            MyTask1 task1 = new MyTask1();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString1 = "2022-05-14 15:18:00";
            Date dateRef1 = sdf1.parse(dateString1);
            System.out.println("字符串1时间：" + dateRef1.toLocaleString() + " 当前时间："
                    + new Date().toLocaleString());
            timer.scheduleAtFixedRate(task1, dateRef1, 3000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
