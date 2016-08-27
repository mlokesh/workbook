package com.edu.group_a;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;

public class Sort {

    private void assertSorted(List<Integer> unsorted, List<Integer> sortedList) {
        Assert.assertThat(quickSort(unsorted), is(sortedList));
    }

    private List<Integer> intList(Integer... ints) {
        return Arrays.asList(ints);
    }

    @Test
    public void verifySort() {
        assertSorted(intList(), intList());
        assertSorted(intList(1), intList(1));
        assertSorted(intList(2, 1), intList(1, 2));
        assertSorted(intList(2, 1, 3), intList(1, 2, 3));
        assertSorted(intList(2, 3, 1), intList(1, 2, 3));
        assertSorted(intList(1, 3, 2), intList(1, 2, 3));
        assertSorted(intList(3, 2, 1), intList(1, 2, 3));
        assertSorted(intList(3, 2, 2, 1), intList(1, 2, 2, 3));
        sortBigList(1000000);
    }

    private void sortBigList(int n) {
        List<Integer> unsorted = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            unsorted.add((int) (Math.random() * 1000.0));
        }
        List<Integer> sorted = quickSort(unsorted);

        for (int i = 0; i < n-1; i++) {
            Assert.assertTrue(sorted.get(i) <= sorted.get(i + 1));
        }
    }

    private List<Integer> quickSort(List<Integer> list) {
        List<Integer> sorted = new ArrayList<Integer>();

        if (list.size() == 0) {
            return list;
        } else {
            List<Integer> l = new ArrayList<Integer>();
            Integer m = list.get(0);
            List<Integer> h = new ArrayList<Integer>();

            for (int i : list.subList(1, list.size())) {
                if (i > m) {
                    h.add(i);
                } else {
                    l.add(i);
                }
            }
            sorted.addAll(quickSort(l));
            sorted.add(m);
            sorted.addAll(quickSort(h));
        }

        return sorted;
    }

    private List<Integer> bubbleSort(List<Integer> list) {
        for (int size = list.size(); size > 0; size--) {
            for (int index = 0; size > index+1; index++) {
                if (outOfOrder(list, index)) {
                    swap(list, index);
                }
            }
        }
        return list;
    }

    private boolean outOfOrder(List<Integer> list, int index) {
        return list.get(index) > list.get(index+1);
    }

    private void swap(List<Integer> list, int index) {
        Integer temp = list.get(index);
        list.set(index, list.get(index+1));
        list.set(index+1, temp);
    }

}
