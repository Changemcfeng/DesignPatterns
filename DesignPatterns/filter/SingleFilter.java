package com.example.reidsspringboot.gof23.filter;
/**
 * The triangle is the most balanced
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: reids-springboot
 * @Auther: Mcfeng
 * @Date: 2020/12/7 22:10
 * @Description:
 */
public class SingleFilter implements IFilter{
    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> result=new ArrayList<>();
        for (Person person:people){
            if (person.getMarital().equalsIgnoreCase(CommonConst.MARTIAL_SINGLE)){
                result.add(person);
            }
        }
        return result;
    }
}