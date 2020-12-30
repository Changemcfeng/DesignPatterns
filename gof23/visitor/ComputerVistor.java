package com.example.reidsspringboot.gof23.visitor;
/**
 * The triangle is the most balanced
 */


public class ComputerVistor implements Visitor{

    @Override
    public void visit(Computer computer) {
        System.out.println("我是其中一员");
    }

    @Override
    public void visit(KeyBoard keyBoard) {
        System.out.println("bb");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("vv");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("hh");
    }
}