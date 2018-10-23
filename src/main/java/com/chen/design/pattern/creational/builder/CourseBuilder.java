package com.chen.design.pattern.creational.builder;

/**
 * 课程的建造类
 *
 * @Author LeifChen
 * @Date 2018-10-22
 */
public class CourseBuilder extends AbstractCourseBuilder {

    private Course course = new Course();

    @Override
    public void buildName(String name) {
        course.setName(name);
    }

    @Override
    public void buildPowerpoint(String powerpoint) {
        course.setPowerpoint(powerpoint);
    }

    @Override
    public void buildVideo(String video) {
        course.setVideo(video);
    }

    @Override
    public void buildArticle(String article) {
        course.setArticle(article);
    }

    @Override
    public void buildQuestion(String question) {
        course.setQuestion(question);
    }

    @Override
    public Course build() {
        return course;
    }
}
