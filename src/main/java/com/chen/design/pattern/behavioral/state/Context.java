package com.chen.design.pattern.behavioral.state;

import lombok.Getter;
import lombok.Setter;

/**
 * 上下文
 *
 * @Author LeifChen
 * @Date 2018-11-19
 */
@Getter
@Setter
public class Context {

    private State state;

    public Context() {
        state = null;
    }
}
