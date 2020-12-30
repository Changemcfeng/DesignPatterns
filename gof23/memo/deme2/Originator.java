package com.example.reidsspringboot.gof23.memo.deme2;

import java.util.ArrayList;
import java.util.List;

/**
 * The triangle is the most balanced
 */


public class Originator {
    private List<String> states;
    private int index;

    public Originator() {
        this.states = new ArrayList<>();
        this.index = 0;
    }
    public Memento createMemento(){
        index++;
        return new Memento(states);
    }
    public void restorememento(Memento memento){
        states=memento.getStates();
    }

    public void setStates(String state) {
        this.states.add(state);
    }
    public void printStates(){
        for (String st:states){
            System.out.println(st);
        }
    }
}