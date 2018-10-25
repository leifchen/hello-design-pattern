package com.chen.design.pattern.creational.singleton.threadlocal;

/**
 * 线程单例
 *
 * @Author LeifChen
 * @Date 2018-10-25
 */
public class Singleton {

    private static final ThreadLocal<Singleton> LOCAL = ThreadLocal.withInitial(Singleton::new);

    private Singleton() {
    }

    public static Singleton getInstance() {
        return LOCAL.get();
    }
}
