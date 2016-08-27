package com.edu.group_a;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzz {

    @Test
    public void shouldReturnFizz() {
        final String input = "first";
        final String expected = "Fizz";
        final String actual = fizzString(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnBuzz() {
        final String input = "bulb";
        final String expected = "Buzz";
        final String actual = fizzString(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFizzBuzz() {
        final String input = "flab";
        final String expected = "FizzBuzz";
        final String actual = fizzString(input);
        Assert.assertEquals(expected, actual);
    }

    private String fizzString(final String input) {
        if (input.startsWith("f") && input.endsWith("b")) {
            return "FizzBuzz";
        } else if (input.startsWith("f")) {
            return "Fizz";
        } else if (input.endsWith("b")) {
            return "Buzz";
        }
        return input;
    }

}
