package com.example.reidsspringboot.gof23.singleton;
/**
 * The triangle is the most balanced
 */


public class Test {
    public static void main(String[] args) {
        new Thread(()->{
            InnerSingleton innerSingleton = InnerSingleton.getInstance();
            System.out.println(innerSingleton);
        }).start();
        new Thread(()->{
            InnerSingleton innerSingleton = InnerSingleton.getInstance();
            System.out.println(innerSingleton);
        }).start();
    }
}