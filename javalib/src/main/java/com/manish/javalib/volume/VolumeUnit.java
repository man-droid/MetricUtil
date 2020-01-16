package com.manish.javalib.volume;


import com.manish.javalib.core.Unit;

public abstract class VolumeUnit implements Unit {
    private double magnitude;
    private String name = this.getClass().getName();

    public VolumeUnit(double magnitude) {
        this.magnitude = magnitude;
    }

    @Override
    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    @Override
    public String toString() {
        return name + "{" +
                "magnitude=" + magnitude +
                '}';
    }
}
