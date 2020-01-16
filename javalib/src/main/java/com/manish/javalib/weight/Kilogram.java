package com.manish.javalib.weight;


import com.manish.javalib.core.IllegalUnitConversionException;
import com.manish.javalib.core.Unit;

public class Kilogram extends WeightUnit {
    public Kilogram(double magnitude) {
        super(magnitude);
    }

    @Override
    public void convertFrom(Unit unit) throws IllegalUnitConversionException {
        double conversion;
        if(unit instanceof Gram) {
            conversion = unit.getMagnitude()/1000;
        } else if(unit instanceof Pound) {
            conversion = unit.getMagnitude() / 2.2046;
        } else {
            throw new IllegalUnitConversionException("Illegal unit");
        }
        setMagnitude(conversion);
    }
}
