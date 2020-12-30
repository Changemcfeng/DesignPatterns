package com.example.reidsspringboot.gof23.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * The triangle is the most balanced
 */


public class FemaleFilter implements IFilter{
    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> result=new ArrayList<>();
        for (Person person:people){
            if (person.getGender().equalsIgnoreCase(CommonConst.GNDER_FEMALE)){
                result.add(person);
            }
        }
        return result;
    }
}