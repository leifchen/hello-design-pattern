package com.chen.bridge;

/**
 * @Desc: 抽象类Shape
 * @Author: LeifChen
 * @Date: 2017-09-14
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();

}
