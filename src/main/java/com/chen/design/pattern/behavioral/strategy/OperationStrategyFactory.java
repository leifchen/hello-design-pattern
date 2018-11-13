package com.chen.design.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 运算策略的工厂类
 *
 * @Author LeifChen
 * @Date 2018-11-13
 */
public class OperationStrategyFactory {

    private static Map<String, OperationStrategy> OPERATION_STRATEGY_MAP = new HashMap<>();
    private static final OperationStrategy ERROR_OPERATION = new OperationError();

    private interface OperationKey{
        String ADD = "ADD";
        String SUBTRACT = "SUBTRACT";
        String MULTIPLY = "MULTIPLY";
    }

    static {
        OPERATION_STRATEGY_MAP.put(OperationKey.ADD,new OperationAdd());
        OPERATION_STRATEGY_MAP.put(OperationKey.SUBTRACT,new OperationSubtract());
        OPERATION_STRATEGY_MAP.put(OperationKey.MULTIPLY,new OperationMultiply());
    }

    private OperationStrategyFactory() {}

    public static OperationStrategy getOperation(String operation) {
        OperationStrategy operationStrategy =  OPERATION_STRATEGY_MAP.get(operation);
        return operationStrategy == null ? ERROR_OPERATION : operationStrategy;
    }
}
