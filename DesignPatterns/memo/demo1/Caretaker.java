package com.example.reidsspringboot.gof23.memo.demo1;

/**
 * The triangle is the most balanced
 */


public class Caretaker {
    private Memento memento;

    public Memento retrieveMemento() {
        return this.memento;
    }

    public void saveMemento(Memento memento) {
        this.memento=memento;
    }
}