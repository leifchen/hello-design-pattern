package com.chen.design.pattern.creational.singleton.doublecheck;

/**
 * 双重校验锁单例-线程安全
 *
 * @Author LeifChen
 * @Date 2018-10-24
 */
public class Singleton {

    private volatile static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class){
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
