package com.example.reidsspringboot.gof23.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * The triangle is the most balanced
 */


public class MaleFilter implements IFilter{
    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> result=new ArrayList<>();
        for (Person person:people){
            if (person.getGender().equalsIgnoreCase(CommonConst.GNDER_MALE)){
                result.add(person);
            }
        }
        return result;
    }
}