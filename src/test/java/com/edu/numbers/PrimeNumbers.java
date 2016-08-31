package com.edu.numbers;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    @Test
    public void verifyPrimeNumberGeneration() {

        final int maxNumber = 100;
        final List<Integer> result = generatePrimeNumbers(maxNumber);

        for (final Integer i : result) {
            System.out.println(i);
        }
    }

    private List<Integer> generatePrimeNumbers(final int maxNumbers) {
        final List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= maxNumbers; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                result.add(i);
            }
        }
        return result;
    }

}
