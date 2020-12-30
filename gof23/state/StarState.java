package com.example.reidsspringboot.gof23.state;

import com.sun.istack.internal.NotNull;

/**
 * The triangle is the most balanced
 */


public class StarState implements State {
    @Override
    public String toString() {
        return "Star State";
    }

    @Override
    public void doAction(@NotNull Context context) {
        System.out.println("Player is start");
        context.setState(this);
    }
}