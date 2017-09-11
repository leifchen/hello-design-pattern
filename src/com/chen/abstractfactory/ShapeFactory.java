package com.chen.abstractfactory;

/**
 * Description: 抽象工厂模式 Shape工厂
 * Author: LeifChen
 * Date: 2017-09-11
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        Shape shape = null;
        switch (shapeType.toUpperCase()) {
            case ShapeConstant.SHAPE_CIRCLE:
                shape = new Circle();
                break;
            case ShapeConstant.SHAPE_RECTANGLE:
                shape = new Rectangle();
                break;
            case ShapeConstant.SHAPE_SQUARE:
                shape = new Square();
                break;
        }
        return shape;
    }

}
