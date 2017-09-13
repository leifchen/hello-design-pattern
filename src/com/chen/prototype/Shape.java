package com.chen.prototype;

/**
 * @Desc: 原型模式: 形状 实现 Cloneable 接口的抽象类。
 * @Author: LeifChen
 * @Date: 2017-09-13
 */
public abstract class Shape implements Cloneable {

    private String id;

    protected String type;

    /**
     * 绘制
     */
    abstract void draw();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

}
