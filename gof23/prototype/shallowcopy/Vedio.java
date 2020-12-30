package com.example.reidsspringboot.gof23.prototype.shallowcopy;
/**
 * The triangle is the most balanced
 */

import java.util.Date;

/**
 * @program: reids-springboot
 * @Auther: Mcfeng
 * @Date: 2020/11/20 12:22
 * @Description:
 */
public class Vedio implements Cloneable{
    private String name;
    private Date creaTime;

    public Vedio(String name, Date creaTime) {
        this.name = name;
        this.creaTime = creaTime;
    }

    @Override
    protected Vedio clone() throws CloneNotSupportedException {
        return (Vedio) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreaTime() {
        return creaTime;
    }

    public void setCreaTime(Date creaTime) {
        this.creaTime = creaTime;
    }

    @Override
    public String toString() {
        return "Vedio{" +
                "name='" + name + '\'' +
                ", creaTime=" + creaTime +
                '}';
    }
}