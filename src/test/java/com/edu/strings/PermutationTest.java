package com.edu.strings;

import org.junit.Test;

public class PermutationTest {

    @Test
    public void findPermutation() {
        final String str = "ABC";
        final int n = str.length();
        final Permutation permutation = new Permutation();
        permutation.permute(str, 0, n - 1);
    }

    private class Permutation {

        private void permute(String str, int l, int r) {
            if (l == r)
                System.out.println(str);
            else {
                for (int i = l; i <= r; i++) {
                    str = swap(str, l, i);
                    permute(str, l + 1, r);
                    str = swap(str, l, i);
                }
            }
        }

        private String swap(String a, int i, int j) {
            char temp;
            char[] charArray = a.toCharArray();
            temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            return String.valueOf(charArray);
        }
    }

}
