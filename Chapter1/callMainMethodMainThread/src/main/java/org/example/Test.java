package org.example;

import java.util.logging.Logger;

public class Test {

    public static void main(String[] args) {
        Logger.getGlobal().info(Thread.currentThread().getName());
    }

}
