package com.edu.threading;

public class SimpleThreads {

    static void threadMessage(String message) {

        final String threadName = Thread.currentThread().getName();
        System.out.format("%s: %s%n", threadName, message);

    }

    private static class MessageLoop implements Runnable {

        @Override
        public void run() {
            String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
            };

            try {
                for (final String anImportantInfo : importantInfo) {
                    Thread.sleep(4000);
                    threadMessage(anImportantInfo);
                }
            } catch (InterruptedException e) {
                threadMessage("I was not done");
            }
        }
    }


    public static void main(String[] args) {
        threadMessage("hello");
    }

}
