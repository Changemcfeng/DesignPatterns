package com.example.reidsspringboot.gof23.memo.demo1;
/**
 * The triangle is the most balanced
 */

import com.example.reidsspringboot.gof23.memo.demo1.Memento;

/**
 * @program: reids-springboot
 * @Auther: Mcfeng
 * @Date: 2020/12/8 19:39
 * @Description:
 */
public class Originator {
    private String state;
    public Memento createMemento(){
        return new Memento(state);
    }
    public void restoreMemento(Memento memento){
        this.state=memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("当前状态"+this.state);
    }
}