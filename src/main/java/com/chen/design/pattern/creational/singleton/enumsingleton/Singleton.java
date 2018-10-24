package com.chen.design.pattern.creational.singleton.enumsingleton;

/**
 * 枚举单例
 *
 * @Author LeifChen
 * @Date 2018-10-24
 */
public enum Singleton {

    /**
     * 实例
     */
    INSTANCE;

    public Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
