package com.example.reidsspringboot.gof23.observer;

import java.util.ArrayList;

/**
 * The triangle is the most balanced
 */

//在对象之间定义了一对多的依赖，
// 这样一来，当一个对象改变状态， 依赖它的对象会收到通知并自动更新
public class Client {
    public static void main(String[] args) {
        Suject suject=new Suject();
        Tesk1 tesk1 = new Tesk1();
        Tesk2 tesk2 = new Tesk2();
        suject.addObserver(tesk1);
        suject.addObserver(tesk2);
        ArrayList<String> strings = new ArrayList<>();strings.add("23");
        suject.notifyObserver(strings);
        System.out.println("--------------------------");
        suject.removeObserver(tesk1);
        suject.notifyObserver(0);

    }
}