package com.edu.algorithms;

public class UnionFind {

    private int[] id;

    public UnionFind(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pId = id[p];
        id[p] = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pId) {
                id[i] = id[p];
            }
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
