package com.chen.design.pattern.behavioral.mediator;

/**
 * 测试类
 *
 * @Author LeifChen
 * @Date 2018-11-19
 */
public class Test {

    public static void main(String[] args) {
        User chen = new User("Chen");
        User leif = new User("Leif");

        chen.sendMessage("Hi! Leif");
        leif.sendMessage("Hello! Chen!");
    }
}
