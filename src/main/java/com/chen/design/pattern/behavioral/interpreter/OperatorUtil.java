package com.chen.design.pattern.behavioral.interpreter;

/**
 * OperatorUtil
 *
 * @Author LeifChen
 * @Date 2018-11-14
 */
public class OperatorUtil {

    private static final String ADD = "+";
    private static final String MULTIPLE = "*";

    public static boolean isOperator(String symbol) {
        return ADD.equals(symbol) || MULTIPLE.equals(symbol);
    }

    public static Interpreter getExpressionObject(Interpreter firstExpression, Interpreter secondExpression, String symbol) {
        if (ADD.equals(symbol)) {
            return new AddInterpreter(firstExpression, secondExpression);
        } else if (MULTIPLE.equals(symbol)) {
            return new MultiInterpreter(firstExpression, secondExpression);
        }
        throw new IllegalArgumentException("运算符号无法识别");
    }
}
