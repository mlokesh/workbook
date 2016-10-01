package com.edu.ds.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void verifyInsertingBeforeAnItem() {
        final LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("root");
        final String elementOne = "elementOne";
        final String elementTwo = "elementTwo";
        linkedList.addLast(elementOne);
        linkedList.addLast(elementTwo);
        linkedList.insertBefore("elementTwo", "elementBetween");
    }

    @Test
    public void verifyLinkedList() {
        final LinkedList<String> linkedList = new LinkedList<>();
        Assert.assertTrue(linkedList.isEmpty());
    }

    @Test
    public void verifyAddingHeadToLinkedList() {
        final LinkedList<String> linkedList = new LinkedList<>();
        final String firstElement = "root";
        linkedList.addFirst(firstElement);
        Assert.assertFalse(linkedList.isEmpty());
        Assert.assertEquals(firstElement, linkedList.getFirst());
    }

    @Test
    public void verifyAddingToLastInLinkedList() {
        final LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("root");
        final String elementOne = "elementOne";
        final String elementTwo = "elementTwo";
        linkedList.addLast(elementOne);
        linkedList.addLast(elementTwo);
        Assert.assertEquals(elementTwo, linkedList.getLast());
    }

    @Test
    public void verifyContainsInLinkedList() {
        final LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("root");
        final String elementOne = "elementOne";
        final String elementTwo = "elementTwo";
        final String elementThree = "elementThree";
        final String elementFour = "elementFour";
        linkedList.addLast(elementOne);
        linkedList.addLast(elementTwo);
        linkedList.addLast(elementThree);
        Assert.assertTrue(linkedList.contains(elementOne));
        Assert.assertTrue(linkedList.contains(elementTwo));
        Assert.assertTrue(linkedList.contains(elementThree));
        Assert.assertFalse(linkedList.contains(elementFour));
    }

}