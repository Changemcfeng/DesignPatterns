package com.example.reidsspringboot.gof23.proxy.demo3;
/**
 * The triangle is the most balanced
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class ProxyInvocationHandler implements InvocationHandler {
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(rent, args);
        return result;
    }
}