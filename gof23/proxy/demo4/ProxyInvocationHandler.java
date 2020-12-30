package com.example.reidsspringboot.gof23.proxy.demo4;
/**
 * The triangle is the most balanced
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: reids-springboot
 * @Auther: Mcfeng
 * @Date: 2020/12/2 19:18
 * @Description:
 */
public class ProxyInvocationHandler implements InvocationHandler {
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object invoke = method.invoke(target, args);
        return invoke;
    }
    public void log(String msg){
        System.out.println(msg);
    }
}