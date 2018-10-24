package com.chen.design.pattern.creational.singleton.reflect;

import java.io.Serializable;

/**
 * 饿汉式单例-线程安全
 *
 * @Author LeifChen
 * @Date 2018-10-24
 */
public class HungrySingleton implements Serializable {

    private static final HungrySingleton INSTANCE;

    static {
        INSTANCE = new HungrySingleton();
    }

    private HungrySingleton() {
        if (INSTANCE != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
