package com.chen.flyweight;

import java.util.HashMap;

/**
 * 享元模式：Shape工厂
 *
 * @Author: LeifChen
 * @Date: 2017-09-19
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (null == circle) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }

}
