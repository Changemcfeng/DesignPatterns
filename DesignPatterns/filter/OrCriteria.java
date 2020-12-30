package com.example.reidsspringboot.gof23.filter;

import java.util.List;

/**
 * The triangle is the most balanced
 */

public class OrCriteria implements IFilter{
    private IFilter iFilter;
    private IFilter other;

    public OrCriteria(IFilter iFilter, IFilter other) {
        this.iFilter = iFilter;
        this.other = other;
    }
    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> peopleFirst = iFilter.meetCriteria(people);
        List<Person> peopleOther = other.meetCriteria(people);

        for (Person person:peopleOther) {
            if (!peopleFirst.contains(person)){
                peopleFirst.add(person);
            }
        }
        return peopleFirst;
    }
}