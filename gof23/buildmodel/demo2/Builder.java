package com.example.reidsspringboot.gof23.buildmodel.demo2;
/**
 * The triangle is the most balanced
 */

/**
 * @program: reids-springboot
 * @Auther: Mcfeng
 * @Date: 2020/11/20 12:02
 * @Description:
 */
public abstract class Builder {
    abstract Builder buildA(String msg);//汉堡
    abstract Builder buildB(String msg);//可乐
    abstract Builder buildC(String msg);//薯条
    abstract Builder buildD(String msg);//甜点
    abstract Product getProduct();
}