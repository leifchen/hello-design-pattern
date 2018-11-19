package com.chen.design.pattern.behavioral.command;

/**
 * 关闭课程命令
 *
 * @Author LeifChen
 * @Date 2018-11-19
 */
public class CloseCourseVideoCommand implements Command{

    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}
