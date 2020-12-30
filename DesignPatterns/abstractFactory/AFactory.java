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
public class AFactory implements ABFactory {
    @Override
    public AIpone getIphone() {
        return new AIpone();
    }

    @Override
    public ARouter getRouter() {
        return new ARouter();
    }
}