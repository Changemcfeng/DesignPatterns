package com.example.reidsspringboot.gof23.filter;
/**
 * The triangle is the most balanced
 */


public class Person {
    //姓名
    private String name;
    //性别
    private String gender;
    //婚姻状态（已婚，未婚）
    private String marital;

    public Person(String name, String gender, String marital) {
        this.name = name;
        this.gender = gender;
        this.marital = marital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", marital='" + marital + '\'' +
                '}';
    }
}