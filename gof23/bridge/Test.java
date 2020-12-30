package com.example.reidsspringboot.gof23.bridge;
/**
 * The triangle is the most balanced
 */

//将抽象部分与它的实现部分分离，使它们都可以独立地变化。
//它是一种对象结构型模式，又称为柄体(Handle and Body)模式或接口(Interface)模式
public class Test {
    public static void main(String[] args) {
        Computer com=new DeskTop(new Apple());
        com.info();
    }
}