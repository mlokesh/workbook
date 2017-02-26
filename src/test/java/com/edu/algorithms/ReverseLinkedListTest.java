package com.edu.algorithms;

import org.junit.Test;

public class ReverseLinkedListTest {


    @Test
    public void shouldReverseLinkedLink() {

        final Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;

        System.out.println("Original linked list: " + head.data + ", " + head.next.data + ", " + head.next.next.data);
        final Node reversed = reverseLinkedLink(head);
        System.out.println("Reversed linked list: " + reversed.data + ", " + reversed.next.data + ", " + reversed.next.next.data);

    }

    private Node reverseLinkedLink(final Node head) {

        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        Node cur = head;
        Node pre = null;

        while (cur != null) {
            Node next = cur.next;
            cur.next = pre;

            pre = cur;
            cur = next;

        }
        return pre;
    }


    class Node {
        int data;
        Node next;

        Node(final int data) {
            this.data = data;
        }
    }

}
