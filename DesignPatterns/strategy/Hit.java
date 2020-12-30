package com.example.reidsspringboot.gof23.strategy;
/**
 * The triangle is the most balanced
 */

/**
 * @program: reids-springboot
 * @Auther: Mcfeng
 * @Date: 2020/12/5 16:16
 * @Description:
 */
public class Hit implements Attackable {
    @Override
    public void attak() {
        System.out.println("拳打");
    }
}