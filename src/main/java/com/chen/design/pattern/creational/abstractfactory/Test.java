package com.chen.design.pattern.creational.abstractfactory;

/**
 * 测试类
 *
 * @Author LeifChen
 * @Date 2018-10-22
 */
public class Test {

    public static void main(String[] args) {
        CourseFactory javaCourseFactory = new JavaCourseFactory();
        AbstractVideo javaVideo = javaCourseFactory.getVideo();
        AbstractArticle javaArticle = javaCourseFactory.getArticle();
        javaVideo.produce();
        javaArticle.produce();

        CourseFactory pythonCourseFactory = new PythonCourseFactory();
        AbstractVideo pythonVideo = pythonCourseFactory.getVideo();
        AbstractArticle pythonArticle = pythonCourseFactory.getArticle();
        pythonVideo.produce();
        pythonArticle.produce();
    }
}
