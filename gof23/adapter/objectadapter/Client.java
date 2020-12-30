package com.example.reidsspringboot.gof23.adapter.objectadapter;
/**
 * The triangle is the most balanced
 */

//将一个类的接口转成客户期望的另外一个接口
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Adapter adapter = new Adapter();
        Adapterr at=new Adapterr(adapter);
        computer.net(at);
    }
}