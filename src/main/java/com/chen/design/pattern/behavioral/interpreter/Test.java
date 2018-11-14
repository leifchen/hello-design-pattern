package com.chen.design.pattern.behavioral.interpreter;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Test
 *
 * @Author LeifChen
 * @Date 2018-11-14
 */
public class Test {

    public static void main(String[] args) {
        // Custom Expression Interpreter
        MyExpressionParser myExpressionParser = new MyExpressionParser();
        int result = myExpressionParser.parse("6 100 11 + *");
        System.out.println("自定义解释器计算结果：" + result);

        // Spring Expression Interpreter
        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("100 * 2 + 400 * 1 + 66");
        result = (int) expression.getValue();
        System.out.println("Spring解释器计算结果：" + result);
    }
}
