package com.chen.design.pattern.creational.singleton.lazy;

/**
 * 懒汉式单例-线程不安全
 *
 * @Author LeifChen
 * @Date 2018-10-24
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
