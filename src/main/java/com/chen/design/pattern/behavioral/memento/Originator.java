package com.chen.design.pattern.behavioral.memento;

import lombok.Getter;
import lombok.Setter;

/**
 * 原始
 *
 * @Author LeifChen
 * @Date 2018-11-16
 */
@Getter
@Setter
public class Originator {

    private String state;

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
