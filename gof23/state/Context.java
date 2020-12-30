package com.example.reidsspringboot.gof23.state;
/**
 * The triangle is the most balanced
 */


public class Context {
    private State state;

    public Context() {
        this.state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}