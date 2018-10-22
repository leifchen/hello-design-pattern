package com.chen.design.pattern.creational.abstractfactory;

/**
 * Java课程的抽象工厂
 *
 * @Author LeifChen
 * @Date 2018-10-22
 */
public class JavaCourseFactory implements CourseFactory {

    @Override
    public AbstractVideo getVideo() {
        return new JavaVideo();
    }

    @Override
    public AbstractArticle getArticle() {
        return new JavaArticle();
    }
}
