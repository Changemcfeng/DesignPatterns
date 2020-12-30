package com.example.reidsspringboot.gof23.proxy.demo4;
/**
 * The triangle is the most balanced
 */

/**
 * @program: reids-springboot
 * @Auther: Mcfeng
 * @Date: 2020/12/2 19:22
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        UserService userService=new UserServiceimpl();
        ProxyInvocationHandler pin = new ProxyInvocationHandler();
        pin.setTarget(userService);
        UserService proxy = (UserService)pin.getProxy();
        proxy.add();
    }
}