package com.chen.Flyweight;

/**
 * 享元模式：测试类
 *
 * @Author: LeifChen
 * @Date: 2017-09-19
 */
public class FlyweightTest {

    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {

        for (int i = 0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(10);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 10);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 10);
    }

}
