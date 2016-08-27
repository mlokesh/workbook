package com.edu.misc;

public class SampleModelNew {

    private String name;
    private double code;

    public SampleModelNew(final String name, final double code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCode() {
        return code;
    }

    public void setCode(double code) {
        this.code = code;
    }

    public static SampleModelNew adapt(SampleModel ob) {
        return new SampleModelNew(ob.getName(), ob.getCode());
    }


}
