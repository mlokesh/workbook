package com.edu.misc;

import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Practice {

    @Test
    public void verify() {
    }

    @Test
    public void verifyFactorialCalculation() {
        final int input = 10;
        final int result = calculateFactorial(input);
        Assert.assertEquals(3628800, result);
    }

    private int calculateFactorial(final int input) {
        int i = input;
        int result = 1;
        while (i != 0) {
            result = result * i;
            i--;
        }
        return result;
    }

    @Test
    public void checkAmstrongNumber() {
        final int input = 371;
        // Amstrong number: Sum of the cubes of its digits is equal to the number itself
        // 371 = 3 * 3 * 3 + 7 * 7 * 7 + 1 * 1 * 1 = 27 + 343 + 1 = 371
        final boolean result = isAmstrongNumber(input);
        Assert.assertTrue(result);
    }

    private boolean isAmstrongNumber(int input) {
        int result = 0;
        int original = input;

        while (original != 0) {
            int remainder = original % 10;
            result += remainder * remainder * remainder;
            original = original/10;
        }

        if (result == input) {
            return true;
        }
        return false;
    }

    @Test
    public void verifyLoneSum() {
        final int a = 10;
        final int b = 2;
        final int c = 2;
        final int result = loneSum(a, b, c);
        Assert.assertEquals(10, result);
    }

    private int loneSum(final int a, final int b, final int c) {
        if (a == b && b == c) {
            return 0;
        }
        if (a == b) {
            return c;
        } else if (a == c) {
            return b;
        } else if (b == c) {
            return a;
        }
        return a + b + c;
    }

    @Test
    public void verifyMakeBrick() {
        final int small = 8; // 1 inch long
        final int big = 0; // 5 inch long
        final int goal = 8;
        final boolean result = makeBricks(small, big, goal);
        Assert.assertTrue(result);
    }

    private boolean makeBricks(final int small, final int big, final int goal) {
        if (goal > small + big * 5) {
            return false;
        } else {
            final int bigBricksToUse = Math.min(big, (goal/5));
            return goal - (bigBricksToUse * 5) <= small;
        }
    }

    @Test
    public void verifyReverseNumber() {
        final int input = 123;
        final int expected = 321;
        final int actual = reverse(input);
        Assert.assertEquals(expected, actual);
    }

    private int reverse(int input) {
        int reverse = 0;
        while (input != 0) {
            reverse = (reverse * 10) + (input % 10);
            input = input/10;
        }
        return reverse;
    }

    @Test
    public void verifyNumberOfWaysToClimb() {
        final int steps = 10;
        final int counter = calculateNumberOfWays(steps);

        System.out.println(calculateNumberOfWays(0));
        System.out.println(calculateNumberOfWays(1));
        System.out.println(calculateNumberOfWays(2));
        System.out.println(calculateNumberOfWays(3));
        System.out.println(calculateNumberOfWays(4));
        System.out.println(calculateNumberOfWays(5));
        System.out.println(calculateNumberOfWays(6));
        System.out.println(calculateNumberOfWays(10));

        System.out.println(calculateNumberOfWays(-1));
    }

    private int calculateNumberOfWays(final int steps) {
        if (steps < 0) {
            return 0;
        } else if (steps == 0) {
            return 1;
        } else {
            return calculateFactorial(steps - 1) + calculateFactorial(steps - 2) + calculateNumberOfWays(steps - 3);
        }
    }

    @Test
    public void check1() {
        System.out.println(countPossibilities(0));
        System.out.println(countPossibilities(1));
        System.out.println(countPossibilities(2));
        System.out.println(countPossibilities(3));
        System.out.println(countPossibilities(4));
    }

    public static int countPossibilities(int n) {
        if (n == 1 || n == 2 || n == 3) return n;
        return countPossibilities(n - 1) + countPossibilities(n - 2) + countPossibilities(n - 3);
    }

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

    @Test
    public void verifyStringOperations() {
        String s = "test";

        System.out.println(s.substring(0, s.length()));
        System.out.println(s.substring(0,1));
        System.out.println(s.substring(1));

        byte[] byteArray = s.getBytes();
        System.out.println(byteArray.toString());
        String parseByteArray = new String(byteArray);
        System.out.println(parseByteArray);
    }

    @Test
    public void verifyDateFormat() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss z");
        Date date = new Date();
        System.out.println(dateFormat.format(date));

        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 1);
    }

    @Test
    public void verifyParsing() {
        String expr = "2*x^3 - 4/5*y + z^2";
        String delims = "[+\\-*/^ ]+";
        String[] tokens = expr.split(delims);

        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
    }

    @Test
    public void iterateMaps() {
        Map<Integer, String> myMap = new HashMap<>();
        Set<Map.Entry<Integer, String>> entrySet = myMap.entrySet();

        for (Map.Entry<Integer, String> entry : entrySet) {
            entry.getKey();
            entry.getValue();
        }

        Iterator entries = myMap.entrySet().iterator();

        while (entries.hasNext()) {
            Map.Entry<Integer, String> thisEntry = (Map.Entry) entries.next();
            thisEntry.getKey();
            thisEntry.getValue();
        }
    }


}
