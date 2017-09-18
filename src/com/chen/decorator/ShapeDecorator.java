package com.chen.decorator;

/**
 * 实现了 Shape 接口的抽象装饰类
 *
 * @Author: LeifChen
 * @Date: 2017-09-18
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }

}
