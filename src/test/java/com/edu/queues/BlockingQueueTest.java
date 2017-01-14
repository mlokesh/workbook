package com.edu.queues;

import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {

    @Test
    public void validateBlockingQueue() throws InterruptedException {
        final BlockingQueue<String> queue = new ArrayBlockingQueue<>(1024);
        queue.put("1");
        queue.put("2");
        queue.put("3");
        queue.put("4");
        System.out.println(queue.take());
        System.out.println(queue.take());
        System.out.println(queue.take());
    }

}
