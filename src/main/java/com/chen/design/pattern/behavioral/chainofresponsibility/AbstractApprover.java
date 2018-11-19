package com.chen.design.pattern.behavioral.chainofresponsibility;

/**
 * 抽象审批人
 *
 * @Author LeifChen
 * @Date 2018-11-19
 */
public abstract class AbstractApprover {

    protected AbstractApprover abstractApprover;

    public void setNextApprover(AbstractApprover abstractApprover){
        this.abstractApprover = abstractApprover;
    }

    /**
     * 发布课程
     * @param course
     */
    public abstract void deploy(Course course);
}
