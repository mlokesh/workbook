package com.edu.misc;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class ReversePolishNotation {

    @Test
    public void evaluateNotation() {
        String[] tokens = new String[] { "2", "1", "+", "3", "*" };
        Assert.assertEquals(9, evaluateRPN(tokens));
    }

    private int evaluateRPN(String[] tokens) {
        int result;
        String operations = "+-*/";

        Stack<String> stack = new Stack<String>();

        for (String token : tokens) {
            if (!operations.contains(token)) {
                stack.push(token);
            } else {
                Integer a = Integer.valueOf(stack.pop());
                Integer b = Integer.valueOf(stack.pop());
                int index = operations.indexOf(token);

                switch (index) {
                    case 0:
                        stack.push(String.valueOf(a+b));
                        break;
                    case 1:
                        stack.push(String.valueOf(b-a));
                        break;
                    case 2:
                        stack.push(String.valueOf(a*b));
                        break;
                    case 3:
                        stack.push(String.valueOf(b/a));
                        break;
                }
            }
        }
        result = Integer.valueOf(stack.pop());

        return result;
    }

}
