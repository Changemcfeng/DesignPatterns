package com.example.reidsspringboot.gof23.strategy;
/**
 * The triangle is the most balanced
 */


public class StepToStep implements Moveable{
    @Override
    public void move() {
        System.out.println("一步一步走");
    }
}