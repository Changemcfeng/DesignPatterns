package com.example.reidsspringboot.gof23.singleton;
/**
 * The triangle is the most balanced
 */

//饿汗单例模式
public class Singleton1 {
    private Singleton1(){}
    private static Singleton1 single1=new Singleton1();
    public static Singleton1 getInstance(){
        return single1;
    }
}