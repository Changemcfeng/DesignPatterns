package com.example.reidsspringboot.gof23.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * The triangle is the most balanced
 */

//通过反射创建的对象是否还是单例 结果显然不是；
//改造静态内部类
public class Test1 {
    public static void main(String[] args) throws Exception {
//        Constructor<Singleton> declaredConstructor = Singleton.class.getDeclaredConstructor();
//        declaredConstructor.setAccessible(true);
//        Singleton innerSingleton = declaredConstructor.newInstance();
//
//        System.out.println(innerSingleton);
//
//        Singleton instance = Singleton.getInstance();
//        System.out.println(instance);
        InnerSingleton instance = InnerSingleton.getInstance();
//        ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("serializable"));
//        outputStream.writeObject(InnerSingleton.getInstance());
//        outputStream.close();

        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("serializable"));
        InnerSingleton o = ((InnerSingleton) objectInputStream.readObject());
        System.out.println(instance==o);


    }
}