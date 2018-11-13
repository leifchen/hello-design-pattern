package com.chen.design.pattern.behavioral.strategy;

/**
 * 运算策略接口
 *
 * @Author LeifChen
 * @Date 2018-11-13
 */
public interface OperationStrategy {

    /**
     * 操作
     * @param num1
     * @param num2
     * @return
     */
    int doOperation(int num1, int num2);
}
