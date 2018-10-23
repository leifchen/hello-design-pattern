package com.chen.design.pattern.creational.builder;

/**
 * 讲师
 *
 * @Author LeifChen
 * @Date 2018-10-22
 */
public class Teacher {

    private AbstractCourseBuilder courseBuilder;

    public Teacher(AbstractCourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course produce(String name,
                          String ppt,
                          String video,
                          String article,
                          String question) {

        courseBuilder.buildName(name);
        courseBuilder.buildPowerpoint(ppt);
        courseBuilder.buildVideo(video);
        courseBuilder.buildArticle(article);
        courseBuilder.buildQuestion(question);
        return courseBuilder.build();
    }
}
