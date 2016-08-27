package com.edu.group_a;

import org.junit.Assert;
import org.junit.Test;

public class Palindrome {

    @Test
    public void validateNumberIsPalindrome() {
        final int input = 10000001;
        final boolean actual = isNumberPalindrome(input);
        Assert.assertTrue(actual);
    }

    private boolean isNumberPalindrome(final int input) {
        int palindrome = input;
        int reverse = 0;

        while(palindrome != 0) {
            reverse = (reverse * 10) + (palindrome%10);
            palindrome = palindrome/10;
        }
        if (input == reverse) {
            return true;
        }
        return false;
    }

    @Test
    public void validateStringIsPalindrome() {
        final String input = "abba";
        final String expectedOutput = "abba";
        final String output = getPalindrome(input);
        System.out.println(output);
        Assert.assertEquals(expectedOutput, output);
    }

    private String getPalindrome(final String input) {
        final char[] inputChars = input.toCharArray();
        int rightCounter = inputChars[0];
        int leftCounter = inputChars.length - 1;

        boolean isPalindrome = true;
        while (rightCounter < inputChars.length/2) {
            if (inputChars[rightCounter] != inputChars[leftCounter]) {
                isPalindrome = false;
            }

            if(isPalindrome) {
                return inputChars.toString();
            }
        }
        return null;
    }

}
