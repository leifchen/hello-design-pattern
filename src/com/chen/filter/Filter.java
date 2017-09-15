package com.chen.filter;

import java.util.List;

/**
 * @Desc: 过滤器模式：过滤接口
 * @Author: LeifChen
 * @Date: 2017-09-15
 */
public interface Filter {

    List<Person> meetCriteria(List<Person> persons);

}
