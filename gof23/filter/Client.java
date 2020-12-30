package com.example.reidsspringboot.gof23.filter;
/**
 * The triangle is the most balanced
 */
import java.util.ArrayList;
import java.util.List;

/**
 * @program: reids-springboot
 * @Auther: Mcfeng
 * @Date: 2020/12/7 22:19
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        IFilter maleFilter=new MaleFilter();
        IFilter femaleFilter=new FemaleFilter();
        IFilter singleFilter=new SingleFilter();
        IFilter andFilter=new AndCriteria(maleFilter,singleFilter);
        IFilter orFilter=new OrCriteria(femaleFilter,singleFilter);

        System.out.println(maleFilter.meetCriteria(persons));
        System.out.println("-------------------------------");
        System.out.println(femaleFilter.meetCriteria(persons));
        System.out.println("-------------------------------");
        System.out.println(singleFilter.meetCriteria(persons));
        System.out.println("-------------------------------");
        System.out.println(andFilter.meetCriteria(persons));
        System.out.println("-------------------------------");
        System.out.println(orFilter.meetCriteria(persons));



    }
}