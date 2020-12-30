package com.example.reidsspringboot.gof23.compent;
/**
 * The triangle is the most balanced
 */


public class Department extends OraiginComponent{


    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}