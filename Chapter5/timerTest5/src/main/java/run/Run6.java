package run;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 超过当前时间，再次执行可以查看任务的追赶性
 */
public class Run6 {
    private static Timer timer = new Timer();

    /**
     * 字符串1时间：2022年5月14日 下午3:53:00 当前时间：2022年5月14日 下午3:53:03
     * 1 begin 运行了！时间为：Sat May 14 15:53:03 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:53:03 CST 2022
     * 1 begin 运行了！时间为：Sat May 14 15:53:05 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:53:05 CST 2022
     * 1 begin 运行了！时间为：Sat May 14 15:53:10 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:53:10 CST 2022
     * 1 begin 运行了！时间为：Sat May 14 15:53:15 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:53:15 CST 2022
     * 1 begin 运行了！时间为：Sat May 14 15:53:20 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:53:20 CST 2022
     * 1 begin 运行了！时间为：Sat May 14 15:53:25 CST 2022
     * 1   end 运行了！时间为：Sat May 14 15:53:25 CST 2022
     */
    static public class MyTask1 extends TimerTask {
        @Override
        public void run() {
            System.out.println("1 begin 运行了！时间为：" + new Date());
            System.out.println("1   end 运行了！时间为：" + new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTask1 task1 = new MyTask1();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString1 = "2022-05-14 15:53:00";
            Date dateRef1 = sdf1.parse(dateString1);
            System.out.println("字符串1时间：" + dateRef1.toLocaleString() + " 当前时间："
                    + new Date().toLocaleString());
            timer.scheduleAtFixedRate(task1, dateRef1, 5000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
