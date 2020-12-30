package com.example.reidsspringboot.gof23.memo.deme2;

import java.util.ArrayList;
import java.util.List;

/**
 * The triangle is the most balanced
 */


public class Caretaker {
    private Originator originator;
    private List<Memento> mementos=new ArrayList<>();
    private int current;

    public Caretaker(Originator originator) {
        this.originator = originator;
        this.current=0;
    }
    public int createMemento(){
        Memento memento= originator.createMemento();
        mementos.add(memento);
        return current++;
    }
    public void restoreMemento(int index){
        Memento memento = mementos.get(index);
        originator.restorememento(memento);
    }
    public void removeMemento(int index){
        mementos.remove(index);
    }
}