package com.chen.design.pattern.creational.singleton.innerclass;

/**
 * 静态内部类单例-线程安全
 *
 * @Author LeifChen
 * @Date 2018-10-24
 */
public class Singleton {

    private static class InnerClass {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        return InnerClass.INSTANCE;
    }
}
