package com.example.reidsspringboot.gof23.singleton;
/**
 * The triangle is the most balanced
 */
//懒汉单例模式
public class Singleton {
    private Singleton(){}
    private static volatile Singleton single=null;
    //双重检查
    public static Singleton getInstance(){
        if (single==null){
            synchronized (Singleton.class){
                single=new Singleton();
            }
        }
        return single;
    }

}