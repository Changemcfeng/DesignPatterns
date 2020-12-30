package com.example.reidsspringboot.gof23.templatemethod;
/**
 * The triangle is the most balanced
 */


public abstract class AbstractTemplate {
    public void operation(){
        //open
        templateMethod();
        System.out.println("end");
    }
    abstract protected void templateMethod();
}