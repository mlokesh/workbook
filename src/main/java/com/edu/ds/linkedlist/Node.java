package com.edu.ds.linkedlist;

public class Node<T> {

    T data;
    Node<T> next;

    public Node(final T data, final Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

}
