package com.chen.design.pattern.creational.builder;

/**
 * 课程的抽象建造类
 *
 * @Author LeifChen
 * @Date 2018-10-22
 */
public abstract class AbstractCourseBuilder {

    /**
     * 构建课程名称
     *
     * @param name
     */
    public abstract void buildName(String name);

    /**
     * 构建课程PPT
     *
     * @param powerpoint
     */
    public abstract void buildPowerpoint(String powerpoint);

    /**
     * 构建课程视频
     *
     * @param video
     */
    public abstract void buildVideo(String video);

    /**
     * 构建课程手记
     *
     * @param article
     */
    public abstract void buildArticle(String article);

    /**
     * 构建课程问答
     *
     * @param question
     */
    public abstract void buildQuestion(String question);

    /**
     * 构建课程
     *
     * @return
     */
    public abstract Course build();
}
