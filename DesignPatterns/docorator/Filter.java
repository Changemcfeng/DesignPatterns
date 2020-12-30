package com.example.reidsspringboot.gof23.docorator;
/**
 * The triangle is the most balanced
 */

/**
 * @program: reids-springboot
 * @Auther: Mcfeng
 * @Date: 2020/12/5 15:41
 * @Description:
 */
public class Filter extends Decorator {

    public Filter(Compent compent) {
        super(compent);
    }

    @Override
    public void operation() {
        System.out.println("滤镜");
        compent.operation();
    }
}