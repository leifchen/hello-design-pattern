package com.chen.factory;

/**
 * Description: 工厂模式 Test
 * Author: LeifChen
 * Date: 2017-09-11
 */
public class FactoryTest {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("square");
        shape3.draw();
    }

}
