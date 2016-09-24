package com.edu.threading;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

    public static void main(String[] args) {
        final Random random = new Random();
        final ExecutorService executor = Executors.newFixedThreadPool(3);

        int waitTime = 600;
        for (int i = 0; i < 10; i++) {
            String name = "New Printer " + i;
            int time = random.nextInt(500);
            waitTime += time;
        }
    }

}
