package com.edu.misc;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class InfixToPostfix {

    @Test
    public void verify() {
        final String input = "1+2*4/5-7+3/6";
        final String expected = "124*5/+7-36/+";
        final String result = infixToPostfix(input);
        Assert.assertEquals(expected, result);
    }

    private String infixToPostfix(final String expression) {
        final StringBuilder postFix = new StringBuilder();
        final Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            final char c = expression.charAt(i);
            if (isOperand(c)) {
                postFix.append(c);
            } else if (isOperator(c)) {
                while (!stack.isEmpty() && !isOpeningParenthesis(stack.peek()) && hasHigherPrecedence(stack.peek(), c)) {
                    postFix.append(stack.peek());
                    stack.pop();
                }
                stack.push(c);
            } else if (isOpeningParenthesis(c)) {
                stack.push(c);
            } else if (isClosingParenthesis(c)) {
                while (!stack.isEmpty() && !isOpeningParenthesis(stack.peek())) {
                    postFix.append(stack.peek());
                    stack.pop();
                }
                stack.pop();
            }
        }
        while (!stack.isEmpty()) {
            postFix.append(stack.peek());
            stack.pop();
        }
        return postFix.toString();
    }

    private boolean isOpeningParenthesis(final char c) {
        return c == '(';
    }

    private boolean isClosingParenthesis(final char c) {
        return c == ')';
    }

    private boolean isOperator(final char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '%';
    }

    private boolean isOperand(final char c) {
        return c >= '0' && c <= '9' || c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
    }

    private boolean hasHigherPrecedence(final char c1, final char c2) {
        return getOperatorWeight(c1) == getOperatorWeight(c2) || getOperatorWeight(c1) > getOperatorWeight(c2);
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
