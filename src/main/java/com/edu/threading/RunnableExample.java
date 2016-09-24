package com.edu.threading;

public class RunnableExample implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String[] args) throws InterruptedException {
        final Thread thread = new Thread(new RunnableExample());
        thread.start();
        thread.sleep(10);
        thread.join();
    }

}
