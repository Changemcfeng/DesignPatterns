package com.example.reidsspringboot.gof23.compent;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The triangle is the most balanced
 */


public class University extends OraiginComponent{
    List<OraiginComponent> oraiginComponents=new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OraiginComponent oraiginComponent) {
        oraiginComponents.add(oraiginComponent);
    }

    @Override
    protected void remove(OraiginComponent oraiginComponent) {
        oraiginComponents.remove(oraiginComponent);

    }

    @Override
    protected void print() {
        System.out.println("----------"+getName()+"----------");
        Iterator<OraiginComponent> iterator = oraiginComponents.iterator();
        while (iterator.hasNext()){
                iterator.next().print();
        }
    }
}