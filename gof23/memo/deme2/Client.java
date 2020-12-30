package com.example.reidsspringboot.gof23.memo.deme2;
/**
 * The triangle is the most balanced
 */


public class Client {
    public static void main(String[] args) {
        Originator o = new Originator();
        Caretaker c = new Caretaker(o);
        //改变状态
        o.setStates("state 0");
        System.out.println(c.createMemento());
        //改变状态
        o.setStates("state 1");
        System.out.println(c.createMemento());
        //建立一个检查点
        o.setStates("state 2");
        System.out.println(c.createMemento());

        o.setStates("state 3");
        //建立一个检查点
        System.out.println(c.createMemento());
        //打印出所有检查点
        o.printStates();
        System.out.println("-----------------恢复检查点-----------------");
        //恢复到第二个检查点
        c.restoreMemento(0);
        //打印出所有检查点
        o.printStates();

    }
}