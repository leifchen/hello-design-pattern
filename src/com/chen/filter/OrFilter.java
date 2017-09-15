package com.chen.filter;

import java.util.List;

/**
 * @Desc: OR-过滤器
 * @Author: LeifChen
 * @Date: 2017-09-15
 */
public class OrFilter implements Filter {

    private Filter filter;

    private Filter otherFilter;

    public OrFilter(Filter filter, Filter otherFilter) {
        this.filter = filter;
        this.otherFilter = otherFilter;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstFilterPersons = filter.meetCriteria(persons);
        List<Person> otherFilterPersons = otherFilter.meetCriteria(persons);

        for (Person person : otherFilterPersons) {
            if (!firstFilterPersons.contains(person)) {
                firstFilterPersons.add(person);
            }
        }
        return firstFilterPersons;
    }

}
