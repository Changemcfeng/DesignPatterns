package com.example.reidsspringboot.gof23.docorator;
/**
 * The triangle is the most balanced
 */


public abstract class Decorator implements Compent {
    Compent compent;

    public Decorator(Compent compent) {
        this.compent = compent;
    }
}