package com.example.reidsspringboot.gof23.compent;
/**
 * The triangle is the most balanced
 */

public abstract class OraiginComponent {
    private String name;
    private String des;
    protected void add(OraiginComponent oraiginComponent){
        throw new UnsupportedOperationException();
    }
    protected void remove(OraiginComponent oraiginComponent){
        throw new UnsupportedOperationException();
    }

    public OraiginComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
   abstract protected void print();
}