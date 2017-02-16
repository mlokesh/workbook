package com.edu.misc;

import org.junit.Test;

public class Factorial {

    @Test
    public void findFactorial() {
        final int n = 4;
        System.out.println("Factorial Of " + n + " is: " + factorial(n));
    }

    private int factorial(int n) {
        System.out.println(n);
        if (n == 1) return 1;
        else {
            return n * factorial(n - 1);
        }
    }
}
