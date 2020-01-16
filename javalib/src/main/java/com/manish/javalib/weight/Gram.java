package com.manish.javalib.weight;


import com.manish.javalib.core.IllegalUnitConversionException;
import com.manish.javalib.core.Unit;

public class Gram extends WeightUnit {
    public Gram(double magnitude) {
        super(magnitude);
    }
    @Override
    public void convertFrom(Unit unit) throws IllegalUnitConversionException {
        double conversion;
        if(unit instanceof Kilogram) {
            conversion = unit.getMagnitude() * 1000;
        } else if(unit instanceof Pound) {
            conversion = unit.getMagnitude() / 0.0022046;
        } else  if(unit instanceof Ounce) {
            conversion = unit.getMagnitude() * 28.349;
        }
        else {
            throw new IllegalUnitConversionException("Illegal unit");
        }
        setMagnitude(conversion);
    }
}
