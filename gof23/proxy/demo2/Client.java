package com.example.reidsspringboot.gof23.proxy.demo2;
/**
 * The triangle is the most balanced
 */

/**
 * @program: reids-springboot
 * @Auther: Mcfeng
 * @Date: 2020/12/2 18:20
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        UserService user=new UserServiceimpl();
        UserServiceProxy proxy=new UserServiceProxy();
        proxy.setUserService(user);
        proxy.add();
    }
}