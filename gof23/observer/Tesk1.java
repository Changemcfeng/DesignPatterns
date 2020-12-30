package com.example.reidsspringboot.gof23.observer;
/**
 * The triangle is the most balanced
 */


public class Tesk1 implements Observer{
    @Override
    public void update(Object object) {
        System.out.println("task1: receive"+object);
    }
}