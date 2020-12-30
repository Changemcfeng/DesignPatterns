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
public class Test {
    public static void main(String[] args) {
        //工厂方法模式（横向动态扩展只增加）
        Car car = new ACarFactory().getCar();
        Car car2=new BCarFactory().getCar();
        car.name();
        car2.name();
    }
}