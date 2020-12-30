package com.example.reidsspringboot.gof23.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * The triangle is the most balanced
 */

//静态内部类 懒汉模式
//序列化问题(不加版本号，不是同一个对象)
public class InnerSingleton implements Serializable {
    //加上版本号配合序列化对象的返回方式才能保证单例
    static final long serialVersionUID = 42L;
    private static class InnerSingleton1{
       private static InnerSingleton instance=new InnerSingleton();
    }
    private InnerSingleton(){
        if(InnerSingleton1.instance!=null){
            throw new RuntimeException("单例不允许多个实例");
        }
    }
    Object readResolve() throws ObjectStreamException {
        return InnerSingleton1.instance;
    }

    public static InnerSingleton getInstance(){
        return InnerSingleton1.instance;
    }
}