package com.chen.design.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式：测试类
 *
 * @Author LeifChen
 * @Date 2018-11-19
 */
public class Test {

    public static void main(String[] args) {
        List<BaseCourse> courseList = new ArrayList<>();

        FreeBaseCourse freeCourse = new FreeBaseCourse();
        freeCourse.setName("《SpringMVC数据绑定》");

        CodingBaseCourse codingCourse = new CodingBaseCourse();
        codingCourse.setName("《Java设计模式》");
        codingCourse.setPrice(199);

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        courseList.forEach(baseCourse -> baseCourse.accept(new VisitorImpl()));
    }
}
