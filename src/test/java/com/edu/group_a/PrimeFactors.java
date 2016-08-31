package com.edu.group_a;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PrimeFactors {

    private Matcher<List<Integer>> isListOf(Integer... ints) {
        return CoreMatchers.is(Arrays.asList(ints));
    }

    @Test
    public void factors() {
        Assert.assertThat(primeFactorsOf(1), isListOf());
        Assert.assertThat(primeFactorsOf(2), isListOf(2));
        Assert.assertThat(primeFactorsOf(3), isListOf(3));
        Assert.assertThat(primeFactorsOf(4), isListOf(2,2));
        Assert.assertThat(primeFactorsOf(5), isListOf(5));
        Assert.assertThat(primeFactorsOf(6), isListOf(2, 3));
        Assert.assertThat(primeFactorsOf(7), isListOf(7));
        Assert.assertThat(primeFactorsOf(8), isListOf(2, 2, 2));
        Assert.assertThat(primeFactorsOf(9), isListOf(3, 3));
        Assert.assertThat(primeFactorsOf(10), isListOf(2, 5));
        Assert.assertThat(primeFactorsOf(11), isListOf(11));
        Assert.assertThat(primeFactorsOf(20), isListOf(2, 2, 5));
        Assert.assertThat(primeFactorsOf(15), isListOf(3, 5));
    }

    private List<Integer> primeFactorsOf(int input) {
        ArrayList<Integer> factors = new ArrayList<>();

        for (int divisor = 2; input > 1; divisor++) {
            for (; input % divisor == 0; input = input/divisor) {
                factors.add(divisor);
            }
        }
        return factors;
    }

    private List<Integer> temp(int input) {
        ArrayList<Integer> factors = new ArrayList<>();
        int divisor = 2;
        while (input > 1) {
            for (; input % divisor == 0; input = input/divisor) {
                factors.add(divisor);
            }
            divisor++;
        }
        return factors;
    }

}
