package com.edu.numbers;

import org.junit.Test;

import java.util.List;

public class FibonacciNumbers {

    @Test
    public void verifyGenerationOfFibonacciNumbers() {
        final int count = 10;
        final int[] result = generate(count);

        for (final Integer i : result) {
            System.out.println(i);
        }
    }

    private int[] generate(int count) {
        int[] result = new int[count];

        result[0] = 0;
        result[1] = 1;

        for (int i = 2; i < count; i++) {
            result[i] = result[i-1] + result[i-2];
        }
        return result;
    }

}
