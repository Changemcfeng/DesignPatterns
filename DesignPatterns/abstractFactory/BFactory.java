package com.example.reidsspringboot.gof23.abstractFactory;
/**
 * The triangle is the most balanced
 */

/**
 * @program: reids-springboot
 * @Auther: Mcfeng
 * @Date: 2020/11/19 17:03
 * @Description:
 */
public class BFactory implements ABFactory{

    @Override
    public Iphone getIphone() {
        return new BIpone();
    }

    @Override
    public Router getRouter() {
        return new BRounter();
    }
}