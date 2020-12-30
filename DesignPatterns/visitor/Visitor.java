package com.example.reidsspringboot.gof23.visitor;

/**
 * The triangle is the most balanced
 */
public interface Visitor {
    void visit(Computer computer);
    void visit(KeyBoard keyBoard);
    void visit(Mouse mouse);
    void visit(Monitor monitor);
}
