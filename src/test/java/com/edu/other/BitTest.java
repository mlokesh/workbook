package com.edu.other;

import org.junit.Test;

public class BitTest {

    @Test
    public void check() {
        final int x = 12;
        final int y = 11;

        final int operationsCount = getBitCounter(x, y);
        System.out.println(operationsCount);
        // http://www.programmerinterview.com/index.php/java-questions/bit-manipulation-interview-question/
    }

    private int getBitCounter(int x, int y) {
        int bitCount = 0;

        int z = x ^ y;  //XOR x and y

        while (z != 0)
        {
            //increment count if last binary digit is a 1:
            bitCount += z & 1;
            z = z >> 1;  //shift Z by 1 bit to the right
        }

        return bitCount;
    }


    /*

    ~ Unary bitwise complement

    & performs AND operation
    ^ performs exclusive OR operation
    | performs inclusive OR operation

    << signed left shift operator (shifts a bit pattern to the left)
    >> signed right shift operator (shifts a bit pattern to the right)

    >>> unsigned right shift operator (
     */

    @Test
    public void bitwiseOperatorTest() {

        final int a = 60; //00111100
        final int b = 13; //00001101
        int c = 0;

        c = a & b;
        System.out.println("a & b (AND Operator)= " + c);

        // a = 0011 1100
        // b = 0000 1101

        // c = a & b = 0000 1100 = 12
        // 1+ 0 = 0, 1 + 1 = 1, 0 + 0 = 0

        c = a | b;
        System.out.println("a | b = (Inclusive OR) " + c);

        // a = 0011 1100
        // b = 0000 1101

        // c = a | b = 0011 1101 = 12
        // 1 + 0 = 1

        c = a ^ b;
        System.out.println("a ^ b = (Exclusive OR) " + c);

        // a = 0011 1100
        // b = 0000 1101
        // 0 + 0 = 0, 1 + 1 = 0, 0 + 1 = 1

        // c = a ^ b = 0011 0001  = 12

        c = ~a;
        System.out.println("~a (Unary) " + c);

        // a = 0011 1100

        // c = 1100 0011 =


        c = a << 2;
        System.out.println("a << 2 (left shift) " + c);

        // a = 0011 1100
        // c = 1111 0000

        c = b << 2;
        System.out.println("b << 2 (signed left shift) " + c);

        // b = 0000 1101
        // c = 0011 0100

        c = a >> 2;
        System.out.println("a >> 2 (signed right shift) " + c);

        // a = 0011 1100
        // c = 0000 1111

        c = a >>> 2;
        System.out.println("a >> 2 (unsigned right shift) " + c);

        // a = 0011 1100
        // c = 0000 1111


    }



}
