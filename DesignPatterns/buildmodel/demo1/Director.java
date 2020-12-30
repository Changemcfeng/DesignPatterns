package com.example.reidsspringboot.gof23.buildmodel.demo1;

import com.example.reidsspringboot.gof23.buildmodel.demo1.Builder;
import com.example.reidsspringboot.gof23.buildmodel.demo1.Product;

/**
 * The triangle is the most balanced
 */

//指挥：核心。负责指挥worker；
public class Director {
    public Product builder(Builder builder){
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();
        return builder.getProduct();
    }
}