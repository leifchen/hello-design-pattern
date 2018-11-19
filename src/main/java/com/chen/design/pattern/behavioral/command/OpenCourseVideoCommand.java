package com.chen.design.pattern.behavioral.command;

/**
 * 开放课程命令
 *
 * @Author LeifChen
 * @Date 2018-11-19
 */
public class OpenCourseVideoCommand implements Command{

    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
