package com.chen.design.pattern.behavioral.template;

/**
 * 课程的抽象类
 *
 * @Author LeifChen
 * @Date 2018-11-12
 */
public abstract class AbstractCourse {

    protected final void makeCourse() {
        makePPT();
        makeVideo();
        if (needWriteArticle()) {
            wirteArticle();
        }
        packageCourse();
    }

    final void makePPT() {
        System.out.println("制作PPT");
    }

    final void makeVideo() {
        System.out.println("制作视频");
    }

    final void wirteArticle() {
        System.out.println("编写手记");
    }

    protected boolean needWriteArticle() {
        return false;
    }

    /**
     * 打包课程
     */
    abstract void packageCourse();
}
