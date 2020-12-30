package com.example.reidsspringboot.gof23.memo.demo1;
/**
 * The triangle is the most balanced
 */


public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public String getState(){
        return this.state;
    }
}