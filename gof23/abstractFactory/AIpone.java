package com.example.reidsspringboot.gof23.abstractFactory;
/**
 * The triangle is the most balanced
 */

public class AIpone implements Iphone{
    @Override
    public void start() {
        System.out.println("A start");
    }

    @Override
    public void shutdown() {
        System.out.println("A shutdown");
    }

    @Override
    public void callup() {
        System.out.println("A callup");
    }

    @Override
    public void sendmesszge() {
        System.out.println("A message");
    }
}