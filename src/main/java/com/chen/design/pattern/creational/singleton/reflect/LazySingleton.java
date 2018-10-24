package com.chen.design.pattern.creational.singleton.reflect;

import java.io.Serializable;

/**
 * 懒汉式单例-线程安全
 *
 * @Author LeifChen
 * @Date 2018-10-24
 */
public class LazySingleton implements Serializable {

    private static LazySingleton instance;

    private LazySingleton() {
        if (instance != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public synchronized static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
