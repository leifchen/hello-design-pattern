package com.chen.design.pattern.creational.singleton.container;

/**
 * 输出单例对象任务
 *
 * @Author LeifChen
 * @Date 2018-10-24
 */
public class Task implements Runnable {

    @Override
    public void run() {
        Singleton.putInstance("object", new Object());
        Object instance = Singleton.getInstance("object");
        System.out.println(Thread.currentThread().getName() + ":" + instance);
    }
}
