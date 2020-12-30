package com.example.reidsspringboot.gof23.templatemethod;
/**
 * The triangle is the most balanced
 */

//定义一个操作中算法的骨架，而将一些步骤延迟到子类中。
// 模板方法可以不改变一个算法的结构即可重新定义该算法的某些特定步骤
public class Cilent {
    public static void main(String[] args) {
        AbstractTemplate template=new Template();
        template.operation();
    }
}