package com.chen.design.pattern.creational.builder;

/**
 * 测试类
 *
 * @Author LeifChen
 * @Date 2018-10-22
 */
public class Test {

    public static void main(String[] args) {
        AbstractCourseBuilder courseBuilder = new CourseBuilder();
        Teacher teacher = new Teacher(courseBuilder);
        Course course = teacher.produce("Java设计模式精讲", "PPT", "课程视频", "手记", "问答");
        System.out.println(course);
    }
}
