package com.chen.design.pattern.behavioral.template;

/**
 * Vue课程
 *
 * @Author LeifChen
 * @Date 2018-11-12
 */
public class VueCourse extends AbstractCourse {
    @Override
    void packageCourse() {
        System.out.println("提供Vue代码");
        System.out.println("提供图片素材");
    }
}
