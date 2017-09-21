package com.chen.chainofresponsibility;

/**
 * 扩展了抽象类 AbstractLogger 的 FileLogger 实体类
 *
 * @Author: LeifChen
 * @Date: 2017-09-21
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }


    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }

}
