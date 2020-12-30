package com.example.reidsspringboot.gof23.prototype.shallowcopy;
/**
 * The triangle is the most balanced
 */

import java.util.Date;

//浅拷贝
public class BClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Vedio vedio = new Vedio("mcfeng", date);
        System.out.println(vedio+"hashcode"+vedio.hashCode());
        Vedio vedio1 = vedio.clone();
        System.out.println(vedio1+"hashcode"+vedio1.hashCode());
        date.setTime(14444444);
        System.out.println(vedio+"hashcode"+vedio1);
    }
}