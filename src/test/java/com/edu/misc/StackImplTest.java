package com.edu.misc;

import org.apache.commons.lang.math.RandomUtils;
import org.junit.Assert;
import org.junit.Test;

public class StackImplTest {

    // LIFO

    @Test
    public void testStackCapacity() throws Exception {
        final Stack stack = new Stack(5);
        Assert.assertEquals(5, stack.getCapacity());
    }

    @Test
    public void testGettingSizeWhenCreated() throws Exception {
        final Stack stack = new Stack(5);
        Assert.assertEquals(0, stack.getSize());
    }

    @Test
    public void testPushingFirstElementAndPeeking() throws Exception {
        final Stack stack = new Stack(5);
        final int firstElement = RandomUtils.nextInt();
        stack.push(firstElement);
        Assert.assertEquals(1, stack.getSize());
        Assert.assertEquals(firstElement, stack.peek());
    }

    @Test
    public void testPushingSecondElementAndPeeking() throws Exception {
        final Stack stack = new Stack(5);
        final int firstElement = RandomUtils.nextInt();
        final int secondElement = RandomUtils.nextInt();
        stack.push(firstElement);
        Assert.assertEquals(1, stack.getSize());
        stack.push(secondElement);
        Assert.assertEquals(2, stack.getSize());
        Assert.assertEquals(secondElement, stack.peek());
    }

    @Test
    public void testStackPopFirstElement() throws Exception {
        final Stack stack = new Stack(5);
        final int element = RandomUtils.nextInt();
        stack.push(element);
        final int result = stack.pop();
        Assert.assertEquals(element, result);
    }

    @Test
    public void testStackPopSecondElement() throws Exception {
        final Stack stack = new Stack(5);
        final int firstElement = RandomUtils.nextInt();
        final int secondElement = RandomUtils.nextInt();
        stack.push(firstElement);
        stack.push(secondElement);
        Assert.assertEquals(secondElement, stack.pop());
        Assert.assertEquals(firstElement, stack.peek());
    }

    @Test
    public void testStackPushPopAndPeek() throws Exception {
        final Stack stack = new Stack(5);
        final int firstElement = RandomUtils.nextInt();
        final int secondElement = RandomUtils.nextInt();
        final int thirdElement = RandomUtils.nextInt();
        final int fourthElement = RandomUtils.nextInt();
        stack.push(firstElement);
        stack.push(secondElement);
        stack.push(thirdElement);
        Assert.assertEquals(thirdElement, stack.pop());
        Assert.assertEquals(secondElement, stack.pop());
        stack.push(fourthElement);
        Assert.assertEquals(fourthElement, stack.peek());
        Assert.assertEquals(fourthElement, stack.pop());
        Assert.assertEquals(firstElement, stack.pop());
    }

    private class Stack {

        private final int capacity;
        private int size = 0;
        private int[] stackArray;
        private int index = -1;

        public Stack(final int capacity) {
            this.capacity = capacity;
            this.stackArray = new int[capacity];
        }

        public void push(final int element) {
            size++;
            index++;
            stackArray[index] = element;
        }

        public int pop() {
            final int element = stackArray[index];
            --index;
            return element;
        }

        public int peek() {
            return stackArray[index];
        }

        public int getSize() {
            return size;
        }

        public int getCapacity() {
            return capacity;
        }
    }

}
