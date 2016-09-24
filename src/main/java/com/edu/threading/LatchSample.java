package com.edu.threading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;

public class LatchSample implements Runnable {

    private CountDownLatch latch;

    private static AtomicLong number = new AtomicLong(0);

    public LatchSample(final CountDownLatch latch) {
        this.latch = latch;
    }

    public long next() {
        return number.getAndIncrement();
    }

    public static void main(String[] args) {

        final CountDownLatch latch = new CountDownLatch(1);
        for (int threadNo = 0; threadNo < 2; threadNo++) {
            Runnable r = new LatchSample(latch);
            new Thread(r).start();
        }
        try {
            latch.countDown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            latch.await();
            Thread.sleep(100);
            System.out.println("Count:"+next());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
