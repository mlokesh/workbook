package com.edu.ds;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Temp {

    @Test
    public void check() {
        final ListMultimap<String, Integer> map = ArrayListMultimap.create();
        final Multimap<String, Integer> multimap = ArrayListMultimap.create();
        final ConcurrentMap<String, String> concurrentMap = new ConcurrentHashMap<>();
    }

    public static void main(String[] args) throws IOException {
        readInputMethodOne();
//        readInputMethodTwo();
    }

    private static void readInputMethodTwo() {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[scan.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    private static void readInputMethodOne() {
        System.out.println("Enter the size of an array");
        Scanner sizeScanner = new Scanner(System.in);
        int size = sizeScanner.nextInt();
        System.out.println("Enter the array of ints");
        int[] intArray = new int[size];
        int i = 0;

        Scanner arrayScanner = new Scanner(System.in);
        while (arrayScanner.hasNextInt()) {
            intArray[i] = arrayScanner.nextInt();
            i++;
        }
        System.out.println("Input array:");
        for (int element : intArray) {
            System.out.println(intArray[element]);
        }
    }

    @Test
    public void checkIterator() throws Exception {
        final List<String> sample = Lists.newArrayList();
        sample.add("test");

        sample.forEach(System.out::println);

    }
}
