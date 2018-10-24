package com.chen.design.pattern.creational.singleton.hungry;

/**
 * 饿汉式单例-线程安全
 *
 * @Author LeifChen
 * @Date 2018-10-24
 */
public class Singleton {

    private static final Singleton INSTANCE;

    static {
        INSTANCE = new Singleton();
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
