package com.example.reidsspringboot.gof23.docorator;
/**
 * The triangle is the most balanced
 */

/**
 * @program: reids-springboot
 * @Auther: Mcfeng
 * @Date: 2020/12/5 15:37
 * @Description:
 */
public class Beauty extends Decorator {
    public Beauty(Compent compent) {
        super(compent);
    }

    @Override
    public void operation() {
        System.out.println("美颜");
        compent.operation();
    }
}