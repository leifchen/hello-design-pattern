package com.chen.design.pattern.creational.builder.update;

/**
 * Test
 *
 * @Author LeifChen
 * @Date 2018-10-22
 */
public class Test {

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildName("Java设计模式精讲")
                .buildVideo("课程视频")
                .buildArticle("手记")
                .build();
        System.out.println(course);
    }
}
