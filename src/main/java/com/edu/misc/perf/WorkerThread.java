package com.edu.misc.perf;

public class WorkerThread implements Runnable {

    private String query;

    public WorkerThread(String query) {
        this.query = query;
    }

    @Override
    public void run() {
        runQueryAndProcessRecords(query);
    }

    private void runQueryAndProcessRecords(String query) {
        try {

            Thread.sleep(10);
            System.out.println(query);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

}
