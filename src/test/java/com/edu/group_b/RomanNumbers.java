package com.edu.group_b;


import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.List;

public class RomanNumbers {

    private final Data data = new Data();

    @Test
    public void shouldConvertRomanLiterals() {
        assertInputOutput(2014, "MMXIV");
    }

    private void assertInputOutput(final int expected, final String input) {
        Assert.assertEquals(expected, data.convert(input));
    }

    private static class Data {

        private final List<Roman> romans;

        public Data() {
            romans = Lists.newArrayList(
                    new Roman("I", 1, "V", "X"),
                    new Roman("V", 5),
                    new Roman("X", 10, "L", "C"),
                    new Roman("L", 50, "L", "C"),
                    new Roman("C", 100, "D", "M"),
                    new Roman("D", 500),
                    new Roman("M", 1000)
            );
        }

        public int convert(final String value) {
            if (value.isEmpty())
                throw new RuntimeException("invalid");
            return convertRecursively(value);
        }

        private int convertRecursively(final String value) {
            if (value.isEmpty()) return 0;

            for (final Roman roman : romans) {
                if (value.startsWith(roman.letter)) {
                    final String nextValue = value.substring(1);
                    return flipSignIfSubtractorFound(roman, nextValue) + convertRecursively(nextValue);
                }
            }
            return 0;
        }

        private int flipSignIfSubtractorFound(final Roman roman, final String nextValue) {
            final Collection<String> subtractors = roman.subtractors;
            int d = roman.num;
            if (subtractors != null) {
                if (hasSubtractorNextInString(subtractors, nextValue)) {
                    d = -d;
                }
            }
            return d;
        }

        private boolean hasSubtractorNextInString(final Collection<String> subtractors, final String value) {
            for (final String sub : subtractors) {
                if (value.startsWith(sub)) return true;
            }
            return false;
        }

        private static class Roman {
            private final String letter;
            private final int num;
            private final List<String> subtractors;

            public Roman(final String letter, final int num, final String... subtractors) {
                this.letter = letter;
                this.num = num;
                this.subtractors = Lists.newArrayList(subtractors);
            }

        }

    }

}
