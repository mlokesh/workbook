package com.edu.ds.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList<T> {

    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(final T item) {
        head = new Node<>(item, head);
    }

    public T getFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        return head.data;
    }

    public void addLast(final T item) {
        if (head == null) {
            addFirst(item);
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node<>(item, null);
        }
    }

    public T getLast() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.getData();
    }

    public boolean contains(final T item) {
        if (head == null) {
            throw new NoSuchElementException();
        }
        Node<T> temp = head;
        while (temp.next != null) {
            if (temp.getData() == item) {
                return true;
            }
            temp = temp.next;
        }
        return temp.getData() == item;
    }

    public void clear() {
        head = null;
    }

    public void insertBefore(final T key, final T item) {
        if (head == null) {
            return;
        }
        if (head.data.equals(key)) {
            addFirst(item);
        }

        Node<T> prev = null;
        Node<T> cur = head;



        Node<T> temp = head;
        while (temp.next != null) {
            if (temp.data.equals(key)) {

            }
        }

    }

    //TODO:
    /*
    Add after an element
    Add before an element
    Remove in the middle
    Remove first
    Remove last
     */

}
