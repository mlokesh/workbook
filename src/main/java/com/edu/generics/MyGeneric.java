package com.edu.generics;

import java.util.Collection;
import java.util.List;

public class MyGeneric<T, U extends Number> {

    private T t;
    private String test;

    public static <T> T addAndReturn(T element, Collection<T> collection) {
        collection.add(element);
        return element;
    }

    public static <U extends Number, X> boolean checkCondition(U u, X x) {
        return false;
    }

    public void totalValue(List<? super T> list) {
    }

    private class ExtendsExample<T extends Runnable> {
        private T t;

    }

    private class WildCard<X extends Number> {

    }

    private class Sample<K, V> {
        private K k;
        private V v;

        public Sample(K k, V v) {
            this.k = k;
            this.v = v;
        }

        public K getK() {
            return k;
        }

        public void setK(K k) {
            this.k = k;
        }

        public V getV() {
            return v;
        }

        public void setV(V v) {
            this.v = v;
        }
    }

    class Garage<X extends Vehicle> {
    }

}
