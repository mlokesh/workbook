package com.edu.ds;

import org.junit.Test;

public class StringStackTest {

    @Test
    public void verifyStackCreation() {
        final StringStack stack = new StringStack(10);
        stack.push("test1");
        System.out.println(stack.peek());
        stack.peek();
        stack.peek();
        System.out.println(stack.pop());
        stack.push("test2");
        stack.push("test3");
        stack.push("test4");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}