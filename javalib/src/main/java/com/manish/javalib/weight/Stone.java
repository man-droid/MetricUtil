package com.manish.javalib.weight;


import com.manish.javalib.core.IllegalUnitConversionException;
import com.manish.javalib.core.Unit;

public class Stone extends WeightUnit {
    public Stone(double magnitude) {
        super(magnitude);
    }

    @Override
    public void convertFrom(Unit unit) throws IllegalUnitConversionException {
        throw new IllegalUnitConversionException("Illegal unit");
    }
}
