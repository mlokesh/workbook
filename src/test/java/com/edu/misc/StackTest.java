package com.edu.misc;

import java.util.ArrayList;
import java.util.List;

public class StackTest {

    private List<Integer> elements = new ArrayList<Integer>();
    private int size = 0;

    public void push(int element) {
        elements.add(size++, element);
    }

    public int pop() {
        if (size == 0) {
            throw new Underflow();
        }
        return elements.get(--size);
    }

    public static class Underflow extends RuntimeException {
    }

}
