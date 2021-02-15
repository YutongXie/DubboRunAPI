package com.qiushui.module;

import java.io.Serializable;

public class ProductPrice implements Serializable {
    private String name;
    private double value;
    private int date;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
