package com.example.reidsspringboot.gof23.test;
/**
 * The triangle is the most balanced
 */


public abstract class AbstractA {
    AbstractA ab;

    public AbstractA(AbstractA ab) {
        this.ab = ab;
    }

    public AbstractA getAb() {
        return ab;
    }

    public void setAb(AbstractA ab) {
        this.ab = ab;
    }
    abstract public boolean precess(Login login);
}