package com.chen.design.pattern.behavioral.strategy;

/**
 * OperationError
 *
 * @Author LeifChen
 * @Date 2018-11-13
 */
public class OperationError implements OperationStrategy{
    @Override
    public int doOperation(int num1, int num2) {
        System.out.println("运算符错误！");
        return -1;
    }
}
