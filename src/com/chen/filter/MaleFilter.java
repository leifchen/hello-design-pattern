package com.chen.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc: FEMALE-过滤器
 * @Author: LeifChen
 * @Date: 2017-09-15
 */
public class MaleFilter implements Filter {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons) {
            if ("MALE".equalsIgnoreCase(person.getGender())) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }

}
