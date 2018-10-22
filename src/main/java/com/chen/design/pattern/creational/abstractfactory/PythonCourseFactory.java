package com.chen.design.pattern.creational.abstractfactory;

/**
 * Python课程的抽象工厂
 *
 * @Author LeifChen
 * @Date 2018-10-22
 */
public class PythonCourseFactory implements CourseFactory {

    @Override
    public AbstractVideo getVideo() {
        return new PythonVideo();
    }

    @Override
    public AbstractArticle getArticle() {
        return new PythonArticle();
    }
}
