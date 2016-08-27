package com.edu.algorithms;

import org.junit.Test;

public class QuickFindTest {

    @Test
    public void verifyQuickFind() {
        QuickFind qf = new QuickFind(10);
        qf.union(6, 3);
        qf.union(3, 7);
        qf.union(4, 0);
        qf.union(3, 8);
        qf.union(9, 6);
        qf.union(5, 0);

        qf.print();
    }

}
