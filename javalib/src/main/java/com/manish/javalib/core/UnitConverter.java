package com.manish.javalib.core;

public interface UnitConverter{
    Unit convert(Unit from, Class<? extends Unit> to);
}
