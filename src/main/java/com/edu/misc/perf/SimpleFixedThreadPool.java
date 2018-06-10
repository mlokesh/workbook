package com.edu.misc.perf;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleFixedThreadPool {

    public static void main(String[] args) {

        List<String> sqlQueries = getSqlQueries();

        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            Runnable worker = new WorkerThread(sqlQueries.get(i));
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }

    private static List<String> getSqlQueries() {
        List<String> sqlQueries = Lists.newArrayList();
        sqlQueries.add("query1");
        sqlQueries.add("query2");
        sqlQueries.add("query3");
        sqlQueries.add("query4");
        sqlQueries.add("query5");
        return sqlQueries;
    }


}
