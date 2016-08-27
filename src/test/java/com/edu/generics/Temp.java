package com.edu.generics;

public class Temp {

    public static <T extends Comparable<T>> int counterGreaterThan(T[] anArray, T elem) {
        int count = 0;

        for (T e : anArray) {
            if (e.compareTo(elem) > 0) {
                ++count;
            }
        }
        return count;
    }

    public static void boxTest(Box<Number> n) {
    }

}
