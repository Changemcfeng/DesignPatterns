package com.example.reidsspringboot.gof23.visitor;

/**
 * The triangle is the most balanced
 */
public interface ComputerPart {
    void accept(Visitor visitor);
}
