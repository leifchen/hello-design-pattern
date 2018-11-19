package com.chen.design.pattern.behavioral.visitor;

/**
 * 访问者实现类
 *
 * @Author LeifChen
 * @Date 2018-11-19
 */
public class VisitorImpl implements Visitor {

    @Override
    public void visit(FreeBaseCourse course) {
        System.out.println("免费课程：" + course.getName());
    }

    @Override
    public void visit(CodingBaseCourse course) {
        System.out.println("实战课程：" + course.getName() + " 价格：" + course.getPrice() + "元");
    }
}
