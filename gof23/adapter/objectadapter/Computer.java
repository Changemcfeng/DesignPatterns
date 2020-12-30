package com.example.reidsspringboot.gof23.adapter.objectadapter;
/**
 * The triangle is the most balanced
 */

/**
 * @program: reids-springboot
 * @Auther: Mcfeng
 * @Date: 2020/11/20 16:42
 * @Description:
 */
public class Computer {
    public void net(NetToUSB nt){
        nt.handlerRequst();
    }

    public static void main(String[] args) {
        //通过类适配器，适配
        Computer computer = new Computer();
        Adapter adapter = new Adapter();
        Adapterr at=new Adapterr(adapter);
        computer.net(at);
    }
}