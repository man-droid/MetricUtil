package com.manish.javalib.core;

public interface Unit {
    double getMagnitude();
    void convertFrom(Unit unit) throws IllegalUnitConversionException;
}
