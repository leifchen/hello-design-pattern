package com.chen.design.pattern.behavioral.iterator;

import lombok.Getter;

/**
 * 课程
 *
 * @Author LeifChen
 * @Date 2018-11-12
 */
public class Course {

    @Getter
    private String name;

    public Course(String name) {
        this.name = name;
    }
}
