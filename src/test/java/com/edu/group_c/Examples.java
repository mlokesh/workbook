package com.edu.group_c;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Examples {

    @Test
    public void validate() {
    }

    private void executeJob() {
    }

    private void runAsync() {
        new Thread(new Runnable() {
            public void run() {
                executeJob();
            }
        }, "Billing Job Execution").start();
    }

    private void runAsyncWithES() {
        final ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.execute(new Runnable() {
            public void run() {
                executeJob();
            }
        });
        executorService.shutdown();
    }

}
