package com.example.reidsspringboot.gof23.buildmodel.demo1;

import com.example.reidsspringboot.gof23.buildmodel.demo1.Product;

/**
 * The triangle is the most balanced
 */

//抽象的建造者
public abstract class Builder {
    abstract void  buildA();
    abstract void  buildB();
    abstract void  buildC();
    abstract void  buildD();

    abstract Product getProduct();
}