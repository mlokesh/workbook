package com.edu.arrays;

import org.junit.Assert;
import org.junit.Test;

public class Subset {

    @Test
    public void findSubsetOfTwoElementsEqualsToSumOfRest() {
        final int[] intArrayA = {1, 2, 5, 7, 4, 11};
        Assert.assertTrue(isValid(intArrayA));

        final int[] intArrayB = {1, 2, 3};
        Assert.assertTrue(isValid(intArrayB));

        final int[] intArrayC = {1};
        Assert.assertFalse(isValid(intArrayC));

        final int[] intArrayD = {2, 2, 4};
        Assert.assertTrue(isValid(intArrayD));
    }

    private boolean isValid(int[] intArray) {
        int sum = 0;
        for (int anIntArray : intArray) {
            sum = sum + anIntArray;
        }
        System.out.println("Sum of all elements in the array: " + sum);
        final int target = sum / 2;

        if (sum % 2 != 0) {
            return false;
        }

        for (int i = 0; i < intArray.length; i++) {
            int first = intArray[i];
            for (int j = i + 1; j < intArray.length; j++) {
                int second = intArray[j];
                if ((first + second) == target) {
                    System.out.println("Elements in the array: {" + intArray[i] + ", " + intArray[j] + "}");
                    return true;
                }
            }
        }
        return false;
    }

}
