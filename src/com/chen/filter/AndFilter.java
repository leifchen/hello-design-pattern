package com.chen.filter;

import java.util.List;

/**
 * @Desc: AND-过滤器
 * @Author: LeifChen
 * @Date: 2017-09-15
 */
public class AndFilter implements Filter {

    private Filter filter;

    private Filter otherFilter;

    public AndFilter(Filter filter, Filter otherFilter) {
        this.filter = filter;
        this.otherFilter = otherFilter;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstFilterPersons = filter.meetCriteria(persons);
        return otherFilter.meetCriteria(firstFilterPersons);
    }

}
