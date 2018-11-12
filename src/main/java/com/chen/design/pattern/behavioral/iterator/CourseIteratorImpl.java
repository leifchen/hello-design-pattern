package com.chen.design.pattern.behavioral.iterator;

import java.util.List;

/**
 * 课程迭代器的实现类
 *
 * @Author LeifChen
 * @Date 2018-11-12
 */
public class CourseIteratorImpl implements CourseIterator {

    private List courseList;
    private int position;

    public CourseIteratorImpl(List courseList) {
        this.courseList = courseList;
    }

    @Override
    public Course nextCourse() {
        System.out.println("返回课程，位置是：" + position);
        Course course = (Course) courseList.get(position);
        position++;
        return course;
    }

    @Override
    public boolean isLastCourse() {
        return position == courseList.size();
    }
}
