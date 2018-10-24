package com.chen.design.pattern.creational.singleton.innerclass;

/**
 * 输出单例对象任务
 *
 * @Author LeifChen
 * @Date 2018-10-24
 */
public class Task implements Runnable {

    @Override
    public void run() {
        Singleton instance = Singleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + instance);
    }
}
