package com.chen.design.pattern.behavioral.template;

/**
 * Java课程
 *
 * @Author LeifChen
 * @Date 2018-11-12
 */
public class JavaCourse extends AbstractCourse {
    @Override
    void packageCourse() {
        System.out.println("提供Java代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
