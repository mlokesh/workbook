package com.edu.group_b;

import com.google.common.collect.ImmutableMap;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Map;

public class NumberValidation {

    @Test
    public void validateNumberAdditionWIthReturnTypeDouble() {
        final double first = 10;
        final BigDecimal second = BigDecimal.ONE;

        final Double result = add(first, second);
        Assert.assertEquals(11.0, result, 0.00);
        Assert.assertTrue(result instanceof Double);
    }

    @Test
    public void validateNumberAdditionWIthReturnTypeBigDecimal() {
        final BigDecimal first = BigDecimal.ONE;
        final double second = 10;

        final BigDecimal result = add(first, second);
        Assert.assertTrue(result.compareTo(first.add(BigDecimal.valueOf(second))) == 0);
        Assert.assertTrue(result instanceof BigDecimal);
    }

    @Test
    public void validateNumberAdditionWIthReturnTypeInteger() {
        final int first = 10;
        final double second = 1;

        final Integer result = add(first, second);
        Assert.assertEquals(result.intValue(), 11);
        Assert.assertTrue(result instanceof Integer);
    }

    private static final Map<Class<? extends Number>, NumberOperator<?>> OPERATORS = new ImmutableMap.Builder<Class<? extends Number>, NumberOperator<?>>()
            .put(Double.class, Doubles.getInstance())
            .put(BigDecimal.class, BigDecimals.getInstance())
            .put(Integer.class, Integers.getInstance())
            .build();

    private static <T extends Number> T add(final T one, final Number two) {

//        final Doubles doubles = Doubles.getInstance();
//        return (T) doubles.add((Double) one, two);

        return getOperator(one).add(one, two);
    }

    private static <T extends Number> NumberOperator<T> getOperator(final T instance) {
        final Class<?> type = instance.getClass();
        if (OPERATORS.containsKey(type)) {
            return (NumberOperator<T>) OPERATORS.get(type);
        } else {
            throw new UnsupportedOperationException("Number operations do not support type [" + type + "]");
        }
    }

}
