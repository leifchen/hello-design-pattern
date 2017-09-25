package com.chen.interpreter;

/**
 * 表达式接口
 *
 * @Author: LeifChen
 * @Date: 2017-09-25
 */
public interface Expression {

    boolean interpret(String context);

}
