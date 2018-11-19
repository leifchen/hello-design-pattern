package com.chen.design.pattern.behavioral.visitor;

import lombok.Getter;
import lombok.Setter;

/**
 * 实战课程
 *
 * @Author LeifChen
 * @Date 2018-11-19
 */
@Getter
@Setter
public class CodingBaseCourse extends BaseCourse {

    private int price;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
