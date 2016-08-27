package com.edu.group_b;

public class Doubles implements NumberOperator<Double> {

    private static final Doubles INSTANCE = new Doubles();

    static Doubles getInstance() {
        return INSTANCE;
    }

    private Doubles() {
    }

    public Double add(Double one, Number two) {
        return one + two.doubleValue();
    }

}
