package com.chen.design.pattern.behavioral.memento;

/**
 * 备忘录模式的测试类
 *
 * @Author LeifChen
 * @Date 2018-11-16
 */
public class Test {

    public static void main(String[] args) {
        Originator originator = new Originator();
        StateManager stateManager = new StateManager();
        originator.setState("State #1");
        stateManager.add(originator.saveStateToMemento());
        originator.setState("State #2");
        stateManager.add(originator.saveStateToMemento());
        originator.setState("State #3");

        System.out.println("当前状态: " + originator.getState());
        originator.getStateFromMemento(stateManager.get());
        System.out.println("第一次执行恢复状态: " + originator.getState());
        originator.getStateFromMemento(stateManager.get());
        System.out.println("第二次执行恢复状态: " + originator.getState());
    }
}
