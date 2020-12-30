package com.example.reidsspringboot.gof23.facade;
/**
 * The triangle is the most balanced
 */


public class Facade {
    public void method(){
        new SubSystem1().method1();
        new SubSystem2().method2();
        new SubSystem3().method3();
    }
}