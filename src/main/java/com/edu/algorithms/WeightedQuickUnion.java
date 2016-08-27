package com.edu.algorithms;

public class WeightedQuickUnion {

    private int[] id;
    private int[] sz;

    public WeightedQuickUnion(int N) {
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 0;
        }
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    private int root(int i) {

        while (i != id[i]) {
            /*
            path compression
            id[i] = id[id[i]];
             */
            i = id[i];
        }
        return i;
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if (i == j) {
            return;
        }
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
    }

    public void print() {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < id.length; i++) {
            result.append(id[i]);
            result.append(" ");
        }
        System.out.println(result.toString());
    }
}
