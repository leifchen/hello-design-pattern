package com.chen.singleton;

/**
 * Description: 单例模式 Test
 * Author: LeifChen
 * Date: 2017-09-12
 */
public class SingletonTest {

    public static void main(String[] args) {
        // 不合法的构造函数
        // 编译时错误：构造函数 SingleObject() 是不可见的
        // SingletonObject singleton = new SingletonObject();

        // 获取唯一可用的对象
        SingletonObject singleton = SingletonObject.getInstance();

        // 显示消息
        singleton.showMessage();
    }

}
