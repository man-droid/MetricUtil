package com.manish.javalib.volume;


import com.manish.javalib.core.IllegalUnitConversionException;
import com.manish.javalib.core.Unit;

public class Litre extends VolumeUnit {
    public Litre(double magnitude) {
        super(magnitude);
    }

    @Override
    public void convertFrom(Unit unit) throws IllegalUnitConversionException {
        throw new IllegalUnitConversionException("Illegal unit");
    }
}
