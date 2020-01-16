package com.manish.javalib.weight;


import com.manish.javalib.core.IllegalUnitConversionException;
import com.manish.javalib.core.Unit;

public class MetricTon extends WeightUnit {
    public MetricTon(double magnitude) {
        super(magnitude);
    }

    @Override
    public void convertFrom(Unit unit) throws IllegalUnitConversionException {
        double conversion;
        if(unit instanceof Kilogram) {
            conversion = unit.getMagnitude() / 1000;
        } else if(unit instanceof Pound) {
            conversion = unit.getMagnitude() / 2240;
        } else {
            throw new IllegalUnitConversionException("Illegal Unit");
        }
        setMagnitude(conversion);
    }
}
