package com.chen.design.pattern.behavioral.memento;

import java.util.Stack;

/**
 * 状态管理
 *
 * @Author LeifChen
 * @Date 2018-11-16
 */
public class StateManager {

    private static final Stack<Memento> MEMENTO_STACK = new Stack<>();

    public void add(Memento state) {
        MEMENTO_STACK.push(state);
    }

    public Memento get() {
        return MEMENTO_STACK.pop();
    }
}
