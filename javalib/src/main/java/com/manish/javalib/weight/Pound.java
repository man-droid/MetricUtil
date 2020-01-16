package com.manish.javalib.weight;


import com.manish.javalib.core.IllegalUnitConversionException;
import com.manish.javalib.core.Unit;

public class Pound extends WeightUnit {
    public Pound(double magnitude) {
        super(magnitude);
    }

    @Override
    public void convertFrom(Unit unit) throws IllegalUnitConversionException {
        double conversion;
        if(unit instanceof Kilogram) {
            conversion = unit.getMagnitude() * 2.2046;
        } else if(unit instanceof Gram) {
            conversion = (unit.getMagnitude() / 1000) * 2.2046;
        } else if(unit instanceof Ounce) {
            conversion = unit.getMagnitude() / 16;
        } else if(unit instanceof Stone) {
            conversion = unit.getMagnitude() * 14;
        } else if(unit instanceof MetricTon) {
            conversion = unit.getMagnitude() * 2240;
        } else {
            throw new IllegalUnitConversionException("Illegal unit");
        }
        setMagnitude(conversion);
    }
}
