package com.example.reidsspringboot.gof23.compent;
/**
 * The triangle is the most balanced
 */


public class Client {
    public static void main(String[] args) {
        OraiginComponent qinHua=new University("清华大学","top");

        OraiginComponent college = new College("计算机","计算机");
        OraiginComponent college1=new College("土木工程","土木工程");

        OraiginComponent department = new Department("计算机科学与技术", "老牌专业");
        OraiginComponent department1 = new Department("信息传输", "信息传输");

        OraiginComponent department2 = new Department("土木工程1", "土木工程1");
        OraiginComponent department3 = new Department("土木工程2", "土木工程2");

        qinHua.add(college);qinHua.add(college1);

        college.add(department);college.add(department1);

        college1.add(department2);college1.add(department3);

        college.print();




    }
}