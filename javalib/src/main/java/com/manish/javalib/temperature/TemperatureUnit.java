package com.manish.javalib.temperature;


import com.manish.javalib.core.Unit;

public abstract class TemperatureUnit implements Unit {
    private double magnitude;
    private String name = this.getClass().getName();

    public TemperatureUnit(double magnitude) {
        this.magnitude = magnitude;
    }

    protected void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    @Override
    public double getMagnitude() {
        return magnitude;
    }

    @Override
    public String toString() {
        return name + "{" +
                "magnitude=" + magnitude +
                '}';
    }
}
