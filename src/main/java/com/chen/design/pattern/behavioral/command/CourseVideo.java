package com.chen.design.pattern.behavioral.command;

/**
 * 课程视频
 *
 * @Author LeifChen
 * @Date 2018-11-19
 */
public class CourseVideo {

    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(name + "课程视频开放");
    }

    public void close() {
        System.out.println(name + "课程视频关闭");
    }
}
