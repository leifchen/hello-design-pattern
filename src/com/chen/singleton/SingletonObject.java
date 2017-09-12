package com.chen.singleton;

/**
 * Description: 单例模式
 * Author: LeifChen
 * Date: 2017-09-12
 */
public class SingletonObject {

    /**
     * 创建 SingleObject 的一个对象
     */
    private static SingletonObject instance = new SingletonObject();

    /**
     * 让构造函数为 private，这样该类就不会被实例化
     */
    private SingletonObject() {
    }

    /**
     * 获取唯一可用的对象
     *
     * @return
     */
    public static SingletonObject getInstance() {
        return instance;
    }

    /**
     * 显示方法
     */
    public void showMessage() {
        System.out.println("Hello Singleton.");
    }

}
