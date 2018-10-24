package com.chen.design.pattern.creational.singleton.lazythread;

/**
 * 懒汉式单例-线程安全
 *
 * @Author LeifChen
 * @Date 2018-10-24
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
