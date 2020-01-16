package com.manish.javalib.weight;


import com.manish.javalib.core.IllegalUnitConversionException;
import com.manish.javalib.core.Unit;

public class Ounce extends WeightUnit {
    public Ounce(double magnitude) {
        super(magnitude);
    }

    @Override
    public void convertFrom(Unit unit) throws IllegalUnitConversionException {
        double conversion;
        if(unit instanceof Pound) {
            conversion = unit.getMagnitude() * 16;
        } else if(unit instanceof Gram) {
            conversion = unit.getMagnitude() / 28.349;
        } else if(unit instanceof Kilogram) {
            conversion = unit.getMagnitude() * 35.274;
        } else {
            throw new IllegalUnitConversionException("Illegal Unit");
        }
        setMagnitude(conversion);
    }
}
