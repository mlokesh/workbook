package com.edu.strings;

import org.junit.Assert;
import org.junit.Test;

public class SentenceReverse {

    @Test
    public void verifySentenceReverse() {
        final String input = "I am Lokesh and I work for CDK";
        final String expected = "CDK for work I and Lokesh am I";

        final String actual = reverseSentence(input);
        Assert.assertTrue(expected.equals(actual));
    }

    private String reverseSentence(final String input) {
        final StringBuilder result = new StringBuilder();
        final String[] stringArray = input.split(" ");

        for (int i = stringArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                result.append(stringArray[i]);
            } else {
                result.append(stringArray[i]);
                result.append(" ");
            }
        }
        return result.toString();
    }

}
