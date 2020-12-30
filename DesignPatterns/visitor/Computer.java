package com.example.reidsspringboot.gof23.visitor;
/**
 * The triangle is the most balanced
 */

/**
 * @program: reids-springboot
 * @Auther: Mcfeng
 * @Date: 2020/12/7 18:25
 * @Description:
 */
public class Computer implements ComputerPart{
    ComputerPart[] part;

    public Computer() {
        this.part = new ComputerPart[]{new Monitor(),new Mouse(),new KeyBoard()};
    }

    @Override
    public void accept(Visitor visitor) {
        for (ComputerPart part1:part){
            part1.accept(visitor);
        }
        visitor.visit(this);
        System.out.println("你是我儿子");
    }
}