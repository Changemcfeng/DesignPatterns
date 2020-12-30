package com.example.reidsspringboot.gof23.buildmodel.demo1;
/**
 * The triangle is the most balanced
 */

//将一个复杂对象的构造与它的表示分离，
//使同样的构建过程可以创建不同的表示，这样的设计模式被称为建造者模式
public class Test {
    public static void main(String[] args) {
        Director director=new Director();
        Product builder = director.builder(new Worker());
        System.out.println(builder.toString());

    }
}