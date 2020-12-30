package com.example.reidsspringboot.gof23.visitor;
/**
 * The triangle is the most balanced
 */


public class Mouse implements ComputerPart{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    @Override
    public String toString() {
        return "Mouse";
    }

}