package com.example.reidsspringboot.gof23.filter;
/**
 * The triangle is the most balanced
 */

import java.util.List;

/**
 * @program: reids-springboot
 * @Auther: Mcfeng
 * @Date: 2020/12/8 17:33
 * @Description:
 */
public class AndCriteria implements IFilter{
    private IFilter iFilter;
    private IFilter other;

    public AndCriteria(IFilter iFilter, IFilter other) {
        this.iFilter = iFilter;
        this.other = other;
    }

    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> people1 = iFilter.meetCriteria(people);
        return other.meetCriteria(people1);
    }
}