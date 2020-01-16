package com.manish.javalib.temperature;

import com.manish.javalib.core.IllegalUnitConversionException;
import com.manish.javalib.core.Unit;


public class Farenheit extends TemperatureUnit {
    public Farenheit(double magnitude) {
        super(magnitude);
    }

    @Override
    public void convertFrom(Unit temperatureUnit) throws IllegalUnitConversionException {
        double conversion;
        if (temperatureUnit instanceof Kelvin) {
            conversion = ((temperatureUnit.getMagnitude() - 273.15) * 9.0 / 5.0) + 32;
        } else if (temperatureUnit instanceof Celsius) {
            conversion = (temperatureUnit.getMagnitude() * 9.0 / 5.0) + 32;
        } else {
            throw new IllegalUnitConversionException("Illegal unit");
        }
        setMagnitude(conversion);
    }
}
