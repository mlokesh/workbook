package com.edu.numbers;

import org.junit.Assert;
import org.junit.Test;

public class PowerOfTwo {

    @Test
    public void validateNumberIsPowerOfTwo() {
        final int input = 8;
        final boolean actual = isNumberPowerOfTwo(input);
        Assert.assertTrue(actual);
    }

    private boolean isNumberPowerOfTwo(int input) {
        if ((input & -input) == input) {
            return true;
        }
        return false;
    }

}
