package com.example.reidsspringboot.gof23.breaker;
/**
 * The triangle is the most balanced
 */

/**
 * @program: reids-springboot
 * @Auther: Mcfeng
 * @Date: 2020/12/8 18:11
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        User mcfeng = new User("mcfeng");
        User cainiao = new User("cainiao");
        mcfeng.sendMessage(cainiao,"hello");
    }
}