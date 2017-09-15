package com.chen.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc: MALE-过滤器
 * @Author: LeifChen
 * @Date: 2017-09-15
 */
public class FemaleFilter implements Filter {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person person : persons) {
            if ("FEMALE".equalsIgnoreCase(person.getGender())) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }

}
