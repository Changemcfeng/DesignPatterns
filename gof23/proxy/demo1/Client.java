package com.example.reidsspringboot.gof23.proxy.demo1;
/**
 * The triangle is the most balanced
 */

//需要定义接口或者父类,
//被代理对象与代理对象一起实现相同的接口或者是继承相同父类
public class Client {
    public static void main(String[] args) {
        Proxy proxy=new Proxy(new Host());
        proxy.rent();
    }
}