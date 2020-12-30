package com.example.reidsspringboot.gof23.bridge;
/**
 * The triangle is the most balanced
 */

/**
 * @program: reids-springboot
 * @Auther: Mcfeng
 * @Date: 2020/11/20 18:19
 * @Description:
 */
public abstract class Computer {
    private Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void info(){
        brand.info();
        System.out.println("台式机");
    }
}