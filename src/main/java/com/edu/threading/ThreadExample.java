package com.edu.threading;

public class ThreadExample extends Thread {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String[] args) {
        (new ThreadExample()).start();
    }

}
