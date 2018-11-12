package com.chen.design.pattern.behavioral.iterator;

/**
 * 课程集合
 *
 * @Author LeifChen
 * @Date 2018-11-12
 */
public interface CourseCollection {

    /**
     * 添加课程
     *
     * @param course
     */
    void addCourse(Course course);

    /**
     * 删除课程
     *
     * @param course
     */
    void removeCourse(Course course);

    /**
     * 获得课程的迭代器
     *
     * @return
     */
    CourseIterator getCourseIterator();
}
