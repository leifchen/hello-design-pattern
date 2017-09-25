package com.chen.interpreter;

/**
 * 实现了 Expression 接口的实体类
 *
 * @Author: LeifChen
 * @Date: 2017-09-25
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }

}
