package com.edu.numbers;

import org.junit.Assert;
import org.junit.Test;

public class ReverseNumber {

    @Test
    public void verifyNumberReverse() {
        final int input = 123;
        final int expected = 321;
        final int actual = reverseNumber(input);
        Assert.assertEquals(expected, actual);
    }

    private int reverseNumber(int input) {
        int reverse = 0;
        while (input != 0) {
            reverse = (reverse * 10) + (input%10);
            input = input/10;
            System.out.println("reverse: " + reverse);
            System.out.println("input: " + input);
        }
        return reverse;
    }

}
