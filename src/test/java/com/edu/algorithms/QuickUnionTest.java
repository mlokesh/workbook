package com.edu.algorithms;

import org.junit.Test;

public class QuickUnionTest {

    @Test
    public void verifyQuickUnion() {
        QuickUnion qu = new QuickUnion(10);
        qu.union(1, 2);
        qu.union(2, 4);
        qu.union(7, 8);
        qu.union(8, 2);

        qu.print();
    }

    @Test
    public void verifyQuickUnionCoursera() {
        QuickUnion qu = new QuickUnion(10);
        qu.union(5,0);
        qu.union(8,9);
        qu.union(3,6);
        qu.union(7,2);
        qu.union(0,7);
        qu.union(9,3);
        qu.union(6,1);
        qu.union(2,6);
        qu.union(7,4);

        qu.print();
    }

}
