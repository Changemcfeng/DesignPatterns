package com.example.reidsspringboot.gof23.buildmodel.demo2;
/**
 * The triangle is the most balanced
 */


public class Test {
    public static void main(String[] args) {
        Builder builder=new Worker();
        Product product = builder.buildA("全家桶").buildB("鸡肉卷").buildC("烤鸡").getProduct();
        System.out.println(product);
    }
}