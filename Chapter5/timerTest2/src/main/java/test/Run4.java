package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 注意！注意！注意！超级占用内存：争抢队列锁(建议用STS/Eclipse测试，不建议IDEA)
 */
public class Run4 {
    static int i = 0;

    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("正常执行了" + i);
        }
    }

    public static void main(String[] args) {
//		Timer timer = new Timer();
        while (true) {
            try {
                i++;
                Timer timer = new Timer();
                MyTask task = new MyTask();
                SimpleDateFormat sdf = new SimpleDateFormat(
                        "yyyy-MM-dd HH:mm:ss");
                String dateString = "2022-3-17 23:38:10";

                Date dateRef = sdf.parse(dateString);
                timer.schedule(task, dateRef);
                timer.cancel();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }
}
