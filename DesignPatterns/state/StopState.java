package com.example.reidsspringboot.gof23.state;

import com.sun.istack.internal.NotNull;

/**
 * The triangle is the most balanced
 */


public class StopState implements  State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player is Stop");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop state";
    }
}