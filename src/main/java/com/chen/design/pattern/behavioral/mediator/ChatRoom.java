package com.chen.design.pattern.behavioral.mediator;

import java.util.Date;

/**
 * 聊天室
 *
 * @Author LeifChen
 * @Date 2018-11-19
 */
public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
