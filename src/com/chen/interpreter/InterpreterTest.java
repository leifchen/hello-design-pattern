package com.chen.interpreter;

/**
 * 解释器模式：测试类
 *
 * @Author: LeifChen
 * @Date: 2017-09-25
 */
public class InterpreterTest {

    // 规则：Chen 和 Jack 是男性
    public static Expression getMaleExpression() {
        Expression chen = new TerminalExpression("Chen");
        Expression jack = new TerminalExpression("Jack");
        return new OrExpression(chen, jack);
    }

    // 规则：Julie 是一个已婚的女性
    public static Expression getMarriedFemaleExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedFemale = getMarriedFemaleExpression();
        System.out.println("Chen is male? " + isMale.interpret("Chen"));
        System.out.println("Julie is a married female? " + isMarriedFemale.interpret("Married Julie"));
    }

}
