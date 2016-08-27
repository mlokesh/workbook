package com.edu.algorithms;

import org.junit.Test;

public class UnionFindTest {

    @Test
    public void verifyUnionFind() {
        UnionFind uf = new UnionFind(10);
        uf.union(1, 2);
        uf.union(3, 2);
        uf.union(2, 7);

        uf.print();
    }

}
