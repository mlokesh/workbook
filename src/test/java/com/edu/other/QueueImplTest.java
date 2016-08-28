package com.edu.other;

import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImplTest {

    @Test
    public void verifyQueue() {

        Queue<String> queue = new PriorityQueue<>();


//        queue.add("Test1");


        System.out.println(queue.offer("Test1"));
        System.out.println(queue.offer("Test1"));




    }

}
