package com.example.reidsspringboot.gof23.factory.simplefactory;
/**
 * The triangle is the most balanced
 */

import com.example.reidsspringboot.gof23.factory.simplefactory.Car;

/**
 * @program: reids-springboot
 * @Auther: Mcfeng
 * @Date: 2020/11/19 15:45
 * @Description:
 */
public class BCar implements Car {
    @Override
    public void name() {
        System.out.println("my name is B");
    }
}