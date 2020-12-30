package com.example.reidsspringboot.gof23.memo.demo1;

/**
 * The triangle is the most balanced
 */


public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("on");
        caretaker.saveMemento(originator.createMemento());
        System.out.println(originator.getState());
        originator.setState("off");
        originator.restoreMemento(caretaker.retrieveMemento());
        System.out.println(originator.getState());
    }
}