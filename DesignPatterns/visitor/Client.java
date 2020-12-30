package com.example.reidsspringboot.gof23.visitor;
/**
 * The triangle is the most balanced
 */


public class Client {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.accept(new ComputerVistor());
    }
}