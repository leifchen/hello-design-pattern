package com.chen.design.pattern.behavioral.template;

/**
 * 测试类
 *
 * @Author LeifChen
 * @Date 2018-11-12
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("Java课程start---");
        AbstractCourse javaCourse = new JavaCourse();
        javaCourse.makeCourse();
        System.out.println("Java课程end---");

        System.out.println("Vue课程start---");
        AbstractCourse vueCourse = new VueCourse();
        vueCourse.makeCourse();
        System.out.println("Vue课程end---");
    }
}
