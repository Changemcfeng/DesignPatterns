package com.example.reidsspringboot.gof23.facade;
/**
 * The triangle is the most balanced
 */

//面模式(Facade Pattern)也叫做外观模式,是一种比较常用的封装模式,
// 其定义如下: 要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行
public class Client {
    public static void main(String[] args) {
        Facade facade=new Facade();
        facade.method();
    }
}