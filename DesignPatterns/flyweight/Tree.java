package com.example.reidsspringboot.gof23.flyweight;
/**
 * The triangle is the most balanced
 */

//树
public class Tree {
    private String name;
    private String data;

    public Tree(String name, String data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}