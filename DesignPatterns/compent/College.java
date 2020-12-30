package com.example.reidsspringboot.gof23.compent;
/**
 * The triangle is the most balanced
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @program: reids-springboot
 * @Auther: Mcfeng
 * @Date: 2020/12/6 21:59
 * @Description:
 */
public class College extends OraiginComponent {
    List<OraiginComponent> oraiginComponents=new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OraiginComponent oraiginComponent) {
        oraiginComponents.add(oraiginComponent);
    }

    @Override
    protected void remove(OraiginComponent oraiginComponent) {
        oraiginComponents.remove(oraiginComponent);

    }

    @Override
    protected void print() {
        System.out.println("----------"+getName()+"----------");
        Iterator<OraiginComponent> iterator = oraiginComponents.iterator();
        while (iterator.hasNext()){
            iterator.next().print();
        }
    }
}