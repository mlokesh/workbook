package com.edu.generics;

import org.junit.Test;

public class Util {

    @Test
    public void check() {
        Pair<Integer, String> p1 = new Pair(1, "apple");
        Pair<Integer, String> p2 = new Pair(2, "pear");

        boolean same = Util.compare(p1, p2);
        System.out.println("same = " + same);
    }

    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }

    class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

}
