package com.chen.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc: SINGLE-过滤器
 * @Author: LeifChen
 * @Date: 2017-09-15
 */
public class SingleFilter implements Filter {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons) {
            if ("SINGLE".equalsIgnoreCase(person.getMaritalStatus())) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }

}
