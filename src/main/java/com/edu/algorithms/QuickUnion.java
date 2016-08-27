package com.edu.algorithms;

public class QuickUnion {

    private int[] id;

    public QuickUnion(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);

        id[i] = j;
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
