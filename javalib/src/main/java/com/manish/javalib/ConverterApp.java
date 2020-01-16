package com.manish.javalib;


import com.manish.javalib.core.Unit;
import com.manish.javalib.core.UnitConverter;
import com.manish.javalib.temperature.Celsius;
import com.manish.javalib.temperature.Farenheit;
import com.manish.javalib.weight.Kilogram;
import com.manish.javalib.weight.Pound;

public class ConverterApp implements UnitConverter {

    public Unit convertUnit(double magnitude, Class<? extends Unit> from, Class<? extends Unit> to) {
        Unit toUnit = null;

        try {
            Unit fromUnit = from.getConstructor(Double.TYPE).newInstance(magnitude);
            toUnit = convert(fromUnit, to);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return toUnit;
    }

    @Override
    public Unit convert(Unit from, Class<? extends Unit> to) {
        Unit toUnit =null;
        try {
            toUnit = to.getConstructor(Double.TYPE).newInstance(0);
            toUnit.convertFrom(from);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return toUnit;
    }

    public static void main(String[] args) {
        ConverterApp converterApp = new ConverterApp();
        Unit unit1= converterApp.convertUnit(1.0, Kilogram.class, Pound.class);
        Unit unit2= converterApp.convertUnit(37.5, Celsius.class, Farenheit.class);
        System.out.println(unit1);
        System.out.println(unit2);
    }
}
