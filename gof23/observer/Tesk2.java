package com.example.reidsspringboot.gof23.observer;
/**
 * The triangle is the most balanced
 */


public class Tesk2 implements Observer{

    @Override
    public void update(Object object) {
        System.out.println("tesk2: received"+object);
    }
}