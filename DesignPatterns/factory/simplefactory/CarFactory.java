package com.example.reidsspringboot.gof23.factory.simplefactory;

import com.example.reidsspringboot.gof23.factory.simplefactory.ACar;
import com.example.reidsspringboot.gof23.factory.simplefactory.BCar;
import com.example.reidsspringboot.gof23.factory.simplefactory.Car;

/**
 * The triangle is the most balanced
 */

//简单工厂方法（当有一个Ccar，则需要修改代码，不满足里氏替换，有缺陷）
public class CarFactory {
    //方式一：
    public static Car getACar(){
        return new ACar();
    }
    public static Car getBCar(){
        return new BCar();
    }

    //方式二：
    public static Car getCar(String name){
        if (name.equals("A")){
            return new ACar();
        }
        if(name.equals("B")){
            return new BCar();
        }
        return null;
    }
}