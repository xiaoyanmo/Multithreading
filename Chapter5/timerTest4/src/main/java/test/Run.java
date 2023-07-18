package test;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 延迟3秒执行任务，每隔5秒执行任务，非守护
 */
public class Run {
    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("运行了！时间为：" + new Date());
        }
    }

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Timer timer = new Timer();
        System.out.println("当前时间：" + new Date().toLocaleString());
        timer.schedule(task, 3000, 5000);
    }
}
