package com.edu.algorithms;

import org.junit.Test;

public class WeightedQuickUnionTest {

    @Test
    public void verifyWeightedQuickUnion() {
        WeightedQuickUnion wqu = new WeightedQuickUnion(10);
        wqu.union(5,0);
        wqu.union(8,9);
        wqu.union(3,6);
        wqu.union(7,2);
        wqu.union(0,7);
        wqu.union(9,3);
        wqu.union(6,1);
        wqu.union(2,6);
        wqu.union(7,4);

        wqu.print();
        System.out.println(wqu.connected(1, 2));
    }

}
