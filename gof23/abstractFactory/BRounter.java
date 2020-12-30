package com.example.reidsspringboot.gof23.abstractFactory;
/**
 * The triangle is the most balanced
 */

/**
 * @program: reids-springboot
 * @Auther: Mcfeng
 * @Date: 2020/11/19 16:47
 * @Description:
 */
public class BRounter implements Router {
    @Override
    public void start() {
        System.out.println("B router start");
    }

    @Override
    public void shutdown() {
        System.out.println("B router shutdown");
    }

    @Override
    public void openwifi() {
        System.out.println("B router open");
    }

    @Override
    public void closewifi() {
        System.out.println("B router close");
    }
}