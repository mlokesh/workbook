package com.edu.strings;

import org.junit.Assert;
import org.junit.Test;

public class CompressData {

    @Test
    public void verifyCompression() {
        final char[] input = {'a', 'a', 'b', 'b', 'b', 'b', 'c', 'c', 'a', 'b'};
        final char[] result = {'a', '2', 'b', '4', 'c', '2', 'a', '1', 'b', '1'};
        final char[] actual = compress(input);
        Assert.assertArrayEquals(result, actual);
    }

    private char[] compress(final char[] input) {
        final StringBuilder result = new StringBuilder();

        char previousChar = input[0];
        int counter = 0;

        for (int i = 0; i < input.length; i++) {

            if (input[i] == previousChar) {
                counter++;
                previousChar = input[i];
            } else {
                result.append(previousChar);
                result.append(counter);
                counter = 1;
                previousChar = input[i];
            }
        }
        result.append(previousChar);
        result.append(counter);

        return result.toString().toCharArray();
    }

}
