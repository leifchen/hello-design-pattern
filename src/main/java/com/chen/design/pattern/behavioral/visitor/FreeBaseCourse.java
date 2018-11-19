package com.chen.design.pattern.behavioral.visitor;

/**
 * 免费课程
 *
 * @Author LeifChen
 * @Date 2018-11-19
 */
public class FreeBaseCourse extends BaseCourse {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
