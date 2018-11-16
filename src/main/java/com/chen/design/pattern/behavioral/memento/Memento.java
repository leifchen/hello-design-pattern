package com.chen.design.pattern.behavioral.memento;

import lombok.Getter;

/**
 * 备忘
 *
 * @Author LeifChen
 * @Date 2018-11-16
 */
@Getter
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }
}
