package com.chen.design.pattern.behavioral.strategy;

/**
 * 内容
 *
 * @Author LeifChen
 * @Date 2018-11-13
 */
public class Context {

    private OperationStrategy operationStrategy;

    public Context(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public int execute(int num1, int num2) {
        return operationStrategy.doOperation(num1, num2);
    }
}
