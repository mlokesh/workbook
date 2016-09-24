package com.edu.misc;

import com.google.common.collect.Lists;
import org.apache.commons.lang.math.RandomUtils;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class ComparatorTest {

    @Test
    public void verifySorting() {
        final Employee firstEmployee = new Employee("Bob", "Finance");
        final Employee secondEmployee = new Employee("Zyba", "Accounting");
        final Employee thirdEmployee = new Employee("Alan", "IT");

        final List<Employee> employees = Lists.newArrayList(firstEmployee, secondEmployee, thirdEmployee);

        Collections.sort(employees, new Comparator<Employee>() {

            public int compare(final Employee o1, final Employee o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });

        for (final Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }

    class Employee {
        String name;
        String dept;

        Employee(final String name, final String dept) {
            this.name = name;
            this.dept = dept;
        }

        public String getName() {
            return name;
        }
    }

    @Test
    public void checkConditionalFlow() {
        final List<String> testStringList;

        if (isValid()) {
            testStringList = Lists.newArrayList("testTrue");
        } else {
            testStringList = Lists.newArrayList("testFalse");
        }

        for (String str : testStringList) {
            System.out.println(str);
        }
    }
    private boolean isValid() {
        return true;
    }

    @Test
    public void check() {
        final Data dataOne = new Data(RandomUtils.nextInt(), RandomUtils.nextDouble() * 1000);
        final Data dataTwo = new Data(RandomUtils.nextInt(), RandomUtils.nextDouble() * 1000);

        List<Data> dataList = Lists.newArrayList(dataOne, dataTwo);
    }

    @Test
    public void nullCheck1() {
        List<Data> dataList = Lists.newArrayList();
        final Data data = new Data();
        data.setId(RandomUtils.nextInt());
        dataList.add(data);
        final BigDecimal perc = BigDecimal.valueOf(dataList.get(0).getPerc());
        System.out.println(perc);

        System.out.println(BigDecimal.ZERO);
    }

    @Test
    public void nullCheck2() {
        List<Data> dataList = Lists.newArrayList();
        final double perc = dataList.get(0).getPerc();
        System.out.println(perc);
    }

    @Test
    public void checkBigDecimal() {
        final BigDecimal one = BigDecimal.valueOf(RandomUtils.nextDouble() * 1000);
        System.out.println(one);
    }

    class Data {
        int id;
        double perc;

        Data() {
        }

        Data(final int id, final double perc) {
            this.id = id;
            this.perc = perc;
        }

        public double getPerc() {
            return perc;
        }

        public void setId(final int id) {
            this.id = id;
        }
    }

    @Test
    public void checkDelta() {
        final double expected = 3249.12;
        final double actual = 3249.13;
        final double delta = 0.02;

        if (expected - actual < delta) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void checkStringFormat() {
        Date date = new Date();
        String result = String.format("Date is %tD", date);
        System.out.println(result);
    }

}
