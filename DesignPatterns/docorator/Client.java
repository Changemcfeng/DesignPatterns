package com.example.reidsspringboot.gof23.docorator;
/**
 * The triangle is the most balanced
 */

//可以在不改变一个对象本身功能的基础上给对象增加额外的新行为
public class Client {
    public static void main(String[] args) {
        Decorator decorator=new Filter(new PhotoComent());
        decorator.operation();
    }
}