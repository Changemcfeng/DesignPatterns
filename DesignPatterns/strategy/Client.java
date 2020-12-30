package com.example.reidsspringboot.gof23.strategy;
/**
 * The triangle is the most balanced
 */

//定义了算法族，分别封装起来，让它们之间可以相互替换，
// 策略模式让算法的变化独立于使用算法的客户。此模式属于行为型模式的一种
public class Client {
    public static void main(String[] args) {
        Zombie zombie=new FlagZombie();
        zombie.display();
        zombie.move();
        zombie.attack();
    }
}