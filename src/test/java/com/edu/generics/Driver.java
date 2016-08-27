package com.edu.generics;

import org.junit.Test;

public class Driver {

    @Test
    public void checkBox() {
        Box<Integer> integerBox = new Box();
    }

    @Test
    public void checkPair() {
        Pair<String, Integer> p1 = new OrderedPair("Even", 8);
        Pair<String, String> p2 = new OrderedPair("Hello", "World");

        System.out.println("p1 = " + p1.getKey() + " " + p1.getValue());
        System.out.println("p2 = " + p2.getKey() + " " + p2.getValue());

        OrderedPair<String, Box<Integer>> p = new OrderedPair("Primes", new Box());
    }

    @Test
    public void checkUtil() {

    }

}
