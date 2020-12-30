package com.example.reidsspringboot.gof23.chainofresponsible;
/**
 * The triangle is the most balanced
 */


public abstract class Handler {
    Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }
    abstract boolean process(Request request);
}