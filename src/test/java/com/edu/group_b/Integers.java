package com.edu.group_b;

public class Integers implements NumberOperator<Integer> {

    private static final Integers INSTANCE = new Integers();

    static Integers getInstance() {
        return INSTANCE;
    }

    private Integers() {
    }

    public Integer add(Integer one, Number two) {
        return one + two.intValue();
    }

}
