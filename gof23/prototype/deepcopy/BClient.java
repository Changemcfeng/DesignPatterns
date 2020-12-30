package com.example.reidsspringboot.gof23.prototype.deepcopy;
/**
 * The triangle is the most balanced
 */


import java.util.Date;
//使用原型实例指定创建对象的种类，
//并且通过拷贝这些原型创建新的对象。原型模式是一种对象创建型模式
//深拷贝
public class BClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Vedio vedio = new Vedio("mcfeng", date);

        System.out.println(vedio+"hashcode"+vedio.hashCode());
        Vedio vedio1 = vedio.clone();
        vedio.setName("11");
        System.out.println(vedio1+"hashcode"+vedio1.hashCode());
        date.setTime(14444444);
        System.out.println(vedio+"hashcode"+vedio1);
    }
}