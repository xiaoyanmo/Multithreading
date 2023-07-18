package org.example;


import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        Logger.getGlobal().log(Level.INFO, () -> String.format("%s %d", thread.getName(), thread.getId()));
    }
}
