package com.example.reidsspringboot.gof23.abstractFactory;
/**
 * The triangle is the most balanced
 */

/**
 * @program: reids-springboot
 * @Auther: Mcfeng
 * @Date: 2020/11/19 16:46
 * @Description:
 */
public class BIpone implements Iphone {
    @Override
    public void start() {
        System.out.println("B start");
    }

    @Override
    public void shutdown() {
        System.out.println("B shutdown");
    }

    @Override
    public void callup() {
        System.out.println("B call");
    }

    @Override
    public void sendmesszge() {
        System.out.println("B message");
    }
}