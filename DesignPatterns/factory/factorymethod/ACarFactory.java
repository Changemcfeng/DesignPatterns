package com.example.reidsspringboot.gof23.factory.factorymethod;
/**
 * The triangle is the most balanced
 */

public class ACarFactory implements Factory {
    @Override
    public Car getCar() {
        return new ACar();
    }
}