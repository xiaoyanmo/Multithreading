package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 单个任务，每隔4秒执行一次，有一个线程中途取消任务
 */
public class Run2 {
    static public class MyTaskA extends TimerTask {
        @Override
        public void run() {
            System.out.println("A运行了！时间为：" + new Date());
            this.cancel();
        }
    }

    static public class MyTaskB extends TimerTask {
        @Override
        public void run() {
            System.out.println("B运行了！时间为：" + new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTaskA taskA = new MyTaskA();
            MyTaskB taskB = new MyTaskB();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2022-05-14 14:27:00";
            Timer timer = new Timer();
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串时间：" + dateRef.toLocaleString() + " 当前时间："
                    + new Date().toLocaleString());
            timer.schedule(taskA, dateRef, 4000);
            timer.schedule(taskB, dateRef, 4000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
