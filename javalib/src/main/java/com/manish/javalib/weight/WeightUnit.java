package com.manish.javalib.weight;


import com.manish.javalib.core.Unit;

public abstract class WeightUnit implements Unit {
    private double magnitude;
    private String name = this.getClass().getName();

    public WeightUnit(double magnitude) {
        this.magnitude = magnitude;
    }

    @Override
    public double getMagnitude() {
        return magnitude;
    }

    protected void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    @Override
    public String toString() {
        return name+"{" +
                "magnitude=" + magnitude +
                '}';
    }
}
