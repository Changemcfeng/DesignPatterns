package com.example.reidsspringboot.gof23.abstractFactory;
/**
 * The triangle is the most balanced
 */

public class ARouter implements Router {
    @Override
    public void start() { System.out.println("A router start");
    }

    @Override
    public void shutdown() {
        System.out.println("A router shutdown");
    }

    @Override
    public void openwifi() {
        System.out.println("A router open");
    }

    @Override
    public void closewifi() {
        System.out.println("A router close");
    }
}