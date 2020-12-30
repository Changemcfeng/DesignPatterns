package com.example.reidsspringboot.gof23.singleton;

//终极单例模式 远超恶汉，懒汉模式（反射破坏，序列化破坏）
public enum EnumSingleton {
    instance;
    public void print(){
        System.out.println(instance.hashCode());
    }
}
