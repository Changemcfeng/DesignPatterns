package com.example.reidsspringboot.gof23.proxy.demo3;
//JDK代理
//JDK实现代理只需要使用newProxyInstance方法,但是该方法需要接收三个参数,
public class Client {
    public static void main(String[] args) {
        Rent rent=new Host();
        ProxyInvocationHandler pin=new ProxyInvocationHandler();
        pin.setRent(rent);
        Rent proxy = (Rent) pin.getProxy();
        proxy.rent();

    }
}