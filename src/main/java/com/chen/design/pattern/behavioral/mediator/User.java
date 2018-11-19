package com.chen.design.pattern.behavioral.mediator;

import lombok.Getter;
import lombok.Setter;

/**
 * 用户
 *
 * @Author LeifChen
 * @Date 2018-11-19
 */
@Getter
@Setter
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this,message);
    }
}
