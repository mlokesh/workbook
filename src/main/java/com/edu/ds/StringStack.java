package com.edu.ds;

public class StringStack {

    private int size;
    private int top = -1;
    private String[] stringArray;

    public StringStack(int size) {
        this.size = size;
        stringArray = new String[size];
    }

    public void push(final String element) {
        ++top;
        stringArray[top] = element;
    }

    public String peek() {
        if (!isEmpty()) {
            return stringArray[top];
        } else {
            throw new Error("Stack Is Empty");
        }
    }

    public String pop() {
        if (!isEmpty()) {
            --top;
            return stringArray[top + 1];
        } else {
            throw new Error("Stack Is Empty");
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

}
