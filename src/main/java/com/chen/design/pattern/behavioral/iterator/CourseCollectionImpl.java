package com.chen.design.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 课程集合的实现类
 *
 * @Author LeifChen
 * @Date 2018-11-12
 */
public class CourseCollectionImpl implements CourseCollection {

    private List courseList;

    public CourseCollectionImpl() {
        courseList = new ArrayList();
    }

    @Override
    public void addCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
