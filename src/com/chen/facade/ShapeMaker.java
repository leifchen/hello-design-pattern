package com.chen.facade;

/**
 * 外观模式：外观类
 *
 * @Author: LeifChen
 * @Date: 2017-09-19
 */
public class ShapeMaker {

    private Shape circle;

    private Shape rectangle;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

}
