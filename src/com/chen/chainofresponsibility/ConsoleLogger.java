package com.chen.chainofresponsibility;

/**
 * 扩展了抽象类 AbstractLogger 的 ConsoleLogger 实体类
 *
 * @Author: LeifChen
 * @Date: 2017-09-21
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }

}
