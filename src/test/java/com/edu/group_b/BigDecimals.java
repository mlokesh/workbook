package com.edu.group_b;

import java.math.BigDecimal;

public class BigDecimals implements NumberOperator<BigDecimal> {

    private static final BigDecimals INSTANCE = new BigDecimals();

    static BigDecimals getInstance() {
        return INSTANCE;
    }

    private BigDecimals() {
    }

    public BigDecimal add(BigDecimal one, Number two) {
        return one.add(new BigDecimal(two.doubleValue()));
    }

}
