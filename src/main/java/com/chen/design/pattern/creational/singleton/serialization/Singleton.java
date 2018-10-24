package com.chen.design.pattern.creational.singleton.serialization;

import java.io.Serializable;

/**
 * 饿汉式单例-线程安全
 *
 * @Author LeifChen
 * @Date 2018-10-24
 */
public class Singleton implements Serializable {

    private static final Singleton INSTANCE;

    static {
        INSTANCE = new Singleton();
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public Object readResolve() {
        return INSTANCE;
    }
}
