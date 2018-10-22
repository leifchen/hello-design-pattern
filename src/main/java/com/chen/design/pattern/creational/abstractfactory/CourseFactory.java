package com.chen.design.pattern.creational.abstractfactory;

/**
 * 课程的抽象工厂
 *
 * @Author LeifChen
 * @Date 2018-10-22
 */
public interface CourseFactory {

    /**
     * 获取视频
     *
     * @return
     */
    AbstractVideo getVideo();

    /**
     * 获取手记
     *
     * @return
     */
    AbstractArticle getArticle();
}
