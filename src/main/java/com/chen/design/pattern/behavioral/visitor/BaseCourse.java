package com.chen.design.pattern.behavioral.visitor;

import lombok.Getter;
import lombok.Setter;

/**
 * 抽象课程
 *
 * @Author LeifChen
 * @Date 2018-11-19
 */
@Getter
@Setter
public abstract class BaseCourse {

    private String name;

    /**
     * 接收访问
     *
     * @param visitor
     */
    public abstract void accept(Visitor visitor);
}
