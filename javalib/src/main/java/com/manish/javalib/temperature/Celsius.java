package com.manish.javalib.temperature;

import com.manish.javalib.core.IllegalUnitConversionException;
import com.manish.javalib.core.Unit;


public class Celsius extends TemperatureUnit {
    public Celsius(double magnitude) {
        super(magnitude);
    }

    @Override
    public void convertFrom(Unit temperatureUnit) throws IllegalUnitConversionException {
        double conversion;
        if (temperatureUnit instanceof Kelvin) {
            conversion = temperatureUnit.getMagnitude() - 273.15;
        } else if (temperatureUnit instanceof Farenheit) {
            conversion = (temperatureUnit.getMagnitude() - 32) * 5.0 / 9.0;
        } else {
            throw new IllegalUnitConversionException("Illegal unit");
        }
        setMagnitude(conversion);
    }
}
