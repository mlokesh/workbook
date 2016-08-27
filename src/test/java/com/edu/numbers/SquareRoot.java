package com.edu.numbers;

import org.junit.Assert;
import org.junit.Test;


public class SquareRoot {

    @Test
    public void verifySquareRoot() {
        Assert.assertEquals(Math.sqrt(2.0), squareRoot(2.0), 0.000000000000001);
        Assert.assertEquals(Math.sqrt(10.0), squareRoot(10.0), 0.000000000000001);
        Assert.assertEquals(Math.sqrt(50.0), squareRoot(50.0), 0.000000000000001);
        Assert.assertEquals(Math.sqrt(100.0), squareRoot(100.0), 0.000000000000001);
        Assert.assertEquals(Math.sqrt(1000.0), squareRoot(1000.0), 0.000000000000001);
        Assert.assertEquals(Math.sqrt(5000.0), squareRoot(5000.0), 0.000000000000001);
        Assert.assertEquals(Math.sqrt(10000.0), squareRoot(10000.0), 0.000000000000001);
        Assert.assertEquals(Math.sqrt(9999.9), squareRoot(9999.9), 0.000000000000001);
    }

    private double squareRoot(double input) {

    // sqr of x; x/y = y --> Guess y so that x/y is close to y.

        double right;
        double squareRoot = input / 2;
        do {
            right = squareRoot;
            squareRoot = ((input / right) + right) / 2;
        } while ((squareRoot - right) != 0);
        return squareRoot;
    }

    // Newton - Raphson Root Finding Algorithm
    // nth root of w = x;
    // x.(power of n) = w
    // x.(power of n) - w = 0;

    // Therefore, if f(x) = x.(power of n) - w, we want to find the value of x where f(x) = 0, that's there the curve crosses x-axis.

}
