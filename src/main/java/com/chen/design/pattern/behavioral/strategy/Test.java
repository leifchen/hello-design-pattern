package com.chen.design.pattern.behavioral.strategy;

/**
 * 测试类
 *
 * @Author LeifChen
 * @Date 2018-11-13
 */
public class Test {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("20 + 8 = " + context.execute(20, 8));

        context = new Context(new OperationSubtract());
        System.out.println("20 - 8 = " + context.execute(20, 8));

        context = new Context(new OperationMultiply());
        System.out.println("20 * 8 = " + context.execute(20, 8));

        // 策略工厂模式
        String operation = "ADD";
        context = new Context(OperationStrategyFactory.getOperation(operation));
        System.out.println("20 + 8 = " + context.execute(20, 8));
    }
}
