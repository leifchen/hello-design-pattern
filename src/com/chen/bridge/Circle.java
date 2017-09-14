package com.chen.bridge;

/**
 * @Desc: 实现 Shape 接口的实体类
 * @Author: LeifChen
 * @Date: 2017-09-14
 */
public class Circle extends Shape {

    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }

}
