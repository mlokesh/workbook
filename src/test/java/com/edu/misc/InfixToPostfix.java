package com.edu.misc;

import org.junit.Test;

import java.util.Stack;

public class InfixToPostfix {

    @Test
    public void verify() {
        final Stack<String> stack = new Stack<>();
        final String input = "1+2*4/5-7+3/6";
        final String expected = "124*5/+7-36/+";
        final String result = infixToPostfix(input);
    }

    private String infixToPostfix(final String expression) {
        String postFix = "";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            if (isOperator(expression.charAt(i))) {
            }
            System.out.println(isOperand(expression.charAt(i)));
            hasHigherPrecedence(stack.peek(), expression.charAt(i));
        }
        return postFix;
    }

    private boolean isOperator(final char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '%';
    }

    private boolean isOperand(final char c) {
        return c >= '0' && c <= '9' || c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
    }

    private boolean hasHigherPrecedence(final char c1, final char c2) {
        return getOperatorWeight(c1) > getOperatorWeight(c2);
    }

    private int getOperatorWeight(final char c) {

        int weight = -1;

        switch (c) {
            case '+':
            case '-':
                weight = 1;
                break;
            case '*':
            case '/':
            case '%':
                weight = 2;
        }
        return weight;
    }

}
