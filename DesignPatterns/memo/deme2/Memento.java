package com.example.reidsspringboot.gof23.memo.deme2;

import java.util.ArrayList;
import java.util.List;

/**
 * The triangle is the most balanced
 */


public class Memento {
    private List<String> states;

    public Memento(List<String> states) {
        this.states = new ArrayList<>(states);
        List<String> list=new ArrayList<>(states);
    }

    public List<String> getStates() {
        return states;
    }


}