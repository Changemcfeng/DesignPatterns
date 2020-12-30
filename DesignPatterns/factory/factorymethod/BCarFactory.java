package com.example.reidsspringboot.gof23.factory.factorymethod;
/**
 * The triangle is the most balanced
 */

/**
 * @program: reids-springboot
 * @Auther: Mcfeng
 * @Date: 2020/11/19 16:12
 * @Description:
 */
public class BCarFactory implements Factory {
    @Override
    public Car getCar() {
        return new BCar();
    }
}