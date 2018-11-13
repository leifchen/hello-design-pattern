package com.chen.design.pattern.behavioral.strategy;

/**
 * 减法的策略实现类
 *
 * @Author LeifChen
 * @Date 2018-11-13
 */
public class OperationSubtract implements OperationStrategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
