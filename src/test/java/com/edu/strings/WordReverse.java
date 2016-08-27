package com.edu.strings;

import org.junit.Assert;
import org.junit.Test;

public class WordReverse {

    @Test
    public void verifyWordReverse() {
        final String input = "Word Problem";
        final String expected = "melborP droW";

        final String actual = reverseWord(input);
        Assert.assertTrue(expected.equals(actual));
    }

    @Test
    public void verifyWordReversesInASentence() {
        final String input = "Word Problem";
        final String expected = "droW melborP";

        final String actual = reverseOnlyWords(input);
        Assert.assertTrue(expected.equals(actual));
    }

    private String reverseWord(final String input) {
        final StringBuilder result = new StringBuilder();
        final char[] charArray = input.toCharArray();

        for (int i = charArray.length - 1; i >= 0; i--) {
            result.append(charArray[i]);
        }
        return result.toString();
    }

    private String reverseOnlyWords(final String input) {
        final StringBuilder result = new StringBuilder();

        final String[] stringArray = input.split(" ");
        for (int i = 0; i < stringArray.length; i++) {
            final String reversedWord = reverseWord(stringArray[i]);
            if (i == stringArray.length - 1 ) {
                result.append(reversedWord);
            } else {
                result.append(reversedWord);
                result.append(" ");
            }
        }
        return result.toString();
    }

}
