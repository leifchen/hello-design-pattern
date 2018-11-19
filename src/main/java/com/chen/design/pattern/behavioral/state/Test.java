package com.chen.design.pattern.behavioral.state;

/**
 * 状态模式：测试类
 *
 * @Author LeifChen
 * @Date 2018-11-19
 */
public class Test {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        StopState stopState = new StopState();
        stopState.doAction(context);
    }
}
