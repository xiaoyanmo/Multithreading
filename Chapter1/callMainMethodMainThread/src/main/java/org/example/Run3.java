package org.example;

public class Run3 {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("hello")).start();
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(5000000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
