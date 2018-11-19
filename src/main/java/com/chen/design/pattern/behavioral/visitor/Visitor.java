package com.chen.design.pattern.behavioral.visitor;

/**
 * 访问者接口
 *
 * @Author LeifChen
 * @Date 2018-11-19
 */
public interface Visitor {

    /**
     * 访问免费课程
     *
     * @param course
     */
    void visit(FreeBaseCourse course);

    /**
     * 访问实战课程
     *
     * @param course
     */
    void visit(CodingBaseCourse course);
}
