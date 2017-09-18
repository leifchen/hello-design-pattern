package com.chen.decorator;

/**
 * 扩展了 ShapeDecorator 类的实体装饰类
 *
 * @Author: LeifChen
 * @Date: 2017-09-18
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }

}