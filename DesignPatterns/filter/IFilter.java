package com.example.reidsspringboot.gof23.filter;

import java.util.List;

/**
 * The triangle is the most balanced
 */
public interface IFilter {
     List<Person> meetCriteria(List<Person> people);
}
