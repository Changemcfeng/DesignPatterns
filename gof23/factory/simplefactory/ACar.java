package com.example.reidsspringboot.gof23.factory.simplefactory;
/**
 * The triangle is the most balanced
 */

import com.example.reidsspringboot.gof23.factory.simplefactory.Car;

/**
 * @program: reids-springboot
 * @Auther: Mcfeng
 * @Date: 2020/11/19 15:42
 * @Description:
 */
public class ACar implements Car {

    @Override
    public void name() {
        System.out.println("my name is A");
    }
}