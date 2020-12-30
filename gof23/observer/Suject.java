package com.example.reidsspringboot.gof23.observer;

import java.util.ArrayList;
import java.util.List;


/**
 * The triangle is the most balanced
 */


public class Suject  {
    private List<Observer> container=new ArrayList<>();
    public void addObserver(Observer observer){
        container.add(observer);
    }
    public void removeObserver(Observer observer){
        container.remove(observer);
    }
    public void notifyObserver(Object object){
        for (Observer item:container) {
            item.update(object);
        }
    }
}