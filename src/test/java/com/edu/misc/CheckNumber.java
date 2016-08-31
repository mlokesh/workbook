package com.edu.misc;

import org.junit.Assert;
import org.junit.Test;

public class CheckNumber {

    private static String[] ONES = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static String[] TEENS = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static String[] TENS = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    @Test
    public void check() {
        String result = "";

        int n = 101723;
        if (n < 100) {
            System.out.println(convert(n));
        } else {
            if (n >= 100000) {
                if (n/1000 % 10 != 0) {
                    result += convert(n/100000) + "hundred" + convert(n / 1000 % 100) + "thousand";
                    System.out.println(result);
                } else {
                    result += convert(n/100000) + "hundredthousand";
                    System.out.println(result);
                }
            }
            else if (n >= 1000) {
                result += convert(n/1000) + "thousand";
                System.out.println(result);
            }
            if (n /100 % 10 != 0) {
                result += convert(n / 100 % 10) + "hundred";
                System.out.println(result);
            }
            if (n % 100 != 0) {
                result += "and" + convert(n % 100);
                System.out.println(result);
            }
        }

        String aa = "onehundredonethousandsevenhundredandtwentythree1";
        Assert.assertTrue(aa.equals(result));


    }


    private String convert(int n) {
        if (n < 10) {
            return ONES[n];
        }
        if (n < 20) {
            return TEENS[n - 10];
        }
        return TENS[n/10 - 2] + (n % 10 != 0 ? ONES[n % 10] : "");
    }

}
