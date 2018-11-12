package com.chen.design.pattern.behavioral.iterator;

/**
 * 课程迭代器
 *
 * @Author LeifChen
 * @Date 2018-11-12
 */
public interface CourseIterator {

    /**
     * 下一节
     *
     * @return
     */
    Course nextCourse();

    /**
     * 是否最后一节
     *
     * @return
     */
    boolean isLastCourse();
}
