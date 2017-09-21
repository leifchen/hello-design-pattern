package com.chen.chainofresponsibility;

/**
 * 扩展了抽象类 AbstractLogger 的 ErrorLogger 实体类
 *
 * @Author: LeifChen
 * @Date: 2017-09-21
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }

}